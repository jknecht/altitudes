package altitudes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class OmnifocusTask {
	
	@XmlAttribute
	String id;
	
	@XmlElement
	String name;

	@XmlElement
	Long rank;

	@XmlElement
	OmnifocusProject project;

	@XmlElement
	String order;

	@XmlElement
	OmnifocusReference context;

	@XmlElement
	OmnifocusReference task;

	@XmlElement
	Date start;

	@XmlElement
	Date completed;

	@XmlElement
	OmnifocusAddedDate added;

	@XmlElement
	Date modified;

	@XmlElement
	String repeat;

	@XmlElement(name="repetition-rule")
	String repetitionRule;

	@XmlElement(name="repetition-method")
	String repetitionMethod;

}
