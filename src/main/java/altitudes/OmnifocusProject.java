package altitudes;

import javax.xml.bind.annotation.XmlElement;

public class OmnifocusProject {
	@XmlElement
	private OmnifocusReference folder;
	
	@XmlElement
	private Boolean singleton;
	
	@XmlElement
	private String status;

	public OmnifocusReference getFolder() {
		return folder;
	}

	public void setFolder(OmnifocusReference folder) {
		this.folder = folder;
	}

	public Boolean getSingleton() {
		return singleton;
	}

	public void setSingleton(Boolean singleton) {
		this.singleton = singleton;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
