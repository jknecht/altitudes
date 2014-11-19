package altitudes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;


public class OmnifocusAddedDate {
	
	
	@XmlValue
	Date value;

	@XmlAttribute(name="order", required=false)
	Integer order;

}
