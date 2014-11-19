package altitudes;

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
	
	
}
