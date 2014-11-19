package altitudes;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class OmnifocusFolder {
	@XmlAttribute
	String id;
	
	@XmlElement
	String name;
	
	@XmlElement
	Long rank;

	@XmlElement
	OmnifocusReference folder;
}
