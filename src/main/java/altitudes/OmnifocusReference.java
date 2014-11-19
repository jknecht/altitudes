package altitudes;

import javax.xml.bind.annotation.XmlAttribute;

public class OmnifocusReference {
	@XmlAttribute
	private String idref;

	public String getIdref() {
		return idref;
	}

	public void setIdref(String idref) {
		this.idref = idref;
	}

	
}
