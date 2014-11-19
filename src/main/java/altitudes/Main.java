package altitudes;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		JacksonXmlModule module = new JacksonXmlModule();
		module.setDefaultUseWrapper(false);
		
		JaxbAnnotationModule jaxbModule = new JaxbAnnotationModule();
		XmlMapper mapper = new XmlMapper(module);
		mapper.registerModule(jaxbModule);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		File omnifocusPackage = new File(System.getProperty("user.home"), "Library/Application Support/OmniFocus/OmniFocus.ofocus");
		File[] dataFiles = omnifocusPackage.listFiles(new FileFilter() {
			
			public boolean accept(File pathname) {
				return pathname.isFile() && pathname.getName().startsWith("00000000") && pathname.getName().endsWith(".zip");
			}
		});
		
		if (dataFiles.length != 1) {
			throw new RuntimeException("Could not reliably identify the Omnifocus data file");
		}
		
		
		try (ZipFile zipFile = new ZipFile(dataFiles[0])) {
			ZipEntry contents = zipFile.getEntry("contents.xml");
			
			OmniFocusDocument doc = mapper.readValue(zipFile.getInputStream(contents), OmniFocusDocument.class);
	
			for (OmnifocusContext task : doc.contexts) {
				System.out.println(task.name);
			}
			for (OmnifocusFolder task : doc.folders) {
				System.out.println(task.name);
			}
			for (OmnifocusTask task : doc.tasks) {
				System.out.println(task.id + " - " + task.name + " [" + task.added.value + "] " + task.added.order);
			}
		}
	}

}
