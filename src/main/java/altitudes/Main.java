package altitudes;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

public class Main {

	public static void main(String[] args) throws ZipException, IOException  {
		JacksonXmlModule module = new JacksonXmlModule();
		module.setDefaultUseWrapper(false);
		
		JaxbAnnotationModule jaxbModule = new JaxbAnnotationModule();
		XmlMapper mapper = new XmlMapper(module);
		mapper.registerModule(jaxbModule);
		mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
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
	
			for (OmnifocusContext task : doc.getContexts()) {
				System.out.println(task.getName());
			}
			for (OmnifocusFolder task : doc.getFolders()) {
				System.out.println(task.getName());
			}
			for (OmnifocusTask task : doc.getTasks()) {
				System.out.println(task.getId() + " - " + task.getName() + " [" + task.getAdded().getValue() + "] " + task.getAdded().getOrder());
			}
		}
	}

}
