package altitudes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class OmnifocusTask {
	
	@XmlAttribute
	private String id;
	
	@XmlElement
	private String name;

	@XmlElement
	private Long rank;

	@XmlElement
	private OmnifocusProject project;

	@XmlElement
	private String order;

	@XmlElement
	private OmnifocusReference context;

	@XmlElement
	private OmnifocusReference task;

	@XmlElement
	private Date start;

	@XmlElement
	private Date completed;

	@XmlElement
	private OmnifocusAddedDate added;

	@XmlElement
	private Date modified;

	@XmlElement
	private String repeat;

	@XmlElement(name="repetition-rule")
	private String repetitionRule;

	@XmlElement(name="repetition-method")
	private String repetitionMethod;

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

	public OmnifocusProject getProject() {
		return project;
	}

	public void setProject(OmnifocusProject project) {
		this.project = project;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public OmnifocusReference getContext() {
		return context;
	}

	public void setContext(OmnifocusReference context) {
		this.context = context;
	}

	public OmnifocusReference getTask() {
		return task;
	}

	public void setTask(OmnifocusReference task) {
		this.task = task;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getCompleted() {
		return completed;
	}

	public void setCompleted(Date completed) {
		this.completed = completed;
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

	public String getRepeat() {
		return repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public String getRepetitionRule() {
		return repetitionRule;
	}

	public void setRepetitionRule(String repetitionRule) {
		this.repetitionRule = repetitionRule;
	}

	public String getRepetitionMethod() {
		return repetitionMethod;
	}

	public void setRepetitionMethod(String repetitionMethod) {
		this.repetitionMethod = repetitionMethod;
	}

	
}
