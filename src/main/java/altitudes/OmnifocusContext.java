package altitudes;

import javax.xml.bind.annotation.XmlElement;

public class OmnifocusContext {
	@XmlElement
	String id;
	
	@XmlElement
	String name;
	
	@XmlElement
	Long rank;

	@XmlElement
	OmnifocusReference context;
}
