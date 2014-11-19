package altitudes;

import javax.xml.bind.annotation.XmlElement;

public class OmnifocusProject {
	@XmlElement
	OmnifocusReference folder;
	
	@XmlElement
	Boolean singleton;
	
	@XmlElement
	String status;
	

}
