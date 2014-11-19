package altitudes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class OmnifocusFolder {
	@XmlAttribute
	private String id;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private Long rank;

	@XmlElement
	private OmnifocusReference folder;

	@XmlElement
	private Date added;
	
	@XmlElement
	private Date modified;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public OmnifocusReference getFolder() {
		return folder;
	}

	public void setFolder(OmnifocusReference folder) {
		this.folder = folder;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	
	
}
