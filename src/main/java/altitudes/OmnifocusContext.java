package altitudes;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class OmnifocusContext {
	@XmlElement
	private String id;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private Long rank;

	@XmlElement
	private OmnifocusReference context;
	
	@XmlElement(name="prohibits-next-action")
	private Boolean prohibitsNextAction;

	@XmlElement
	private OmnifocusAddedDate added;
	
	@XmlElement
	private Date modified;
	
	@XmlElement
	private Boolean hidden;
	
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

	public OmnifocusReference getContext() {
		return context;
	}

	public void setContext(OmnifocusReference context) {
		this.context = context;
	}

	/**
	 * Indicates whether the context is on-hold.
	 * 
	 * @return
	 */
	public Boolean getProhibitsNextAction() {
		return prohibitsNextAction;
	}

	public void setProhibitsNextAction(Boolean prohibitsNextAction) {
		this.prohibitsNextAction = prohibitsNextAction;
	}

	public OmnifocusAddedDate getAdded() {
		return added;
	}

	public void setAdded(OmnifocusAddedDate added) {
		this.added = added;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	/**
	 * Indicates whether the context is dropped
	 * 
	 * @return
	 */
	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}
	
	
	
}
