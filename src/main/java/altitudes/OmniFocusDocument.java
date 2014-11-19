package altitudes;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="omnifocus")
public class OmniFocusDocument {
	
	@XmlElement(name="context")
	private List<OmnifocusContext> contexts;

	@XmlElement(name="folder")
	private List<OmnifocusFolder> folders;

	@XmlElement(name="task")
	private List<OmnifocusTask> tasks;

	public List<OmnifocusContext> getContexts() {
		return contexts;
	}

	public void setContexts(List<OmnifocusContext> contexts) {
		this.contexts = contexts;
	}

	public List<OmnifocusFolder> getFolders() {
		return folders;
	}

	public void setFolders(List<OmnifocusFolder> folders) {
		this.folders = folders;
	}

	public List<OmnifocusTask> getTasks() {
		return tasks;
	}

	public void setTasks(List<OmnifocusTask> tasks) {
		this.tasks = tasks;
	}

	
}
