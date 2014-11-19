package altitudes;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="omnifocus")
public class OmniFocusDocument {
	
	@XmlElement(name="context")
	List<OmnifocusContext> contexts;

	@XmlElement(name="folder")
	List<OmnifocusFolder> folders;

	@XmlElement(name="task")
	List<OmnifocusTask> tasks;

}
