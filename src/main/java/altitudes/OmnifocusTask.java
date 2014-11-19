package altitudes;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class OmnifocusTask {
	
	public static enum Order {
		parallel,
		sequential
	}
	
	public static enum RepetitionMethod {
		fixed,
		startAfterCompletion("start-after-completion"),
		dueAfterCompletion("due-after-completion");
		
		private String value;
		
		private RepetitionMethod() {
			this.value = this.name();
		}
		
		private RepetitionMethod(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value;
		}
	}
	
	@XmlAttribute
	private String id;
	
	@XmlElement
	private String name;

	@XmlElement
	private Long rank;

	@XmlElement
	private OmnifocusProject project;

	@XmlElement
	private Order order;

	@XmlElement
	private OmnifocusReference context;

	@XmlElement
	private OmnifocusReference task;

	@XmlElement
	private Date start;

	@XmlElement
	private Date due;

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
	private RepetitionMethod repetitionMethod;

	@XmlElement(name="estimated-minutes")
	private Integer estimatedMinutes;
	
	@XmlElement(name="completed-by-children")
	private Boolean completedByChildren;
	
	@XmlElement
	private Boolean flagged;
	
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
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

	public RepetitionMethod getRepetitionMethod() {
		return repetitionMethod;
	}

	public void setRepetitionMethod(RepetitionMethod repetitionMethod) {
		this.repetitionMethod = repetitionMethod;
	}

	public Integer getEstimatedMinutes() {
		return estimatedMinutes;
	}

	public void setEstimatedMinutes(Integer estimatedMinutes) {
		this.estimatedMinutes = estimatedMinutes;
	}

	public Boolean getCompletedByChildren() {
		return completedByChildren;
	}

	public void setCompletedByChildren(Boolean completedByChildren) {
		this.completedByChildren = completedByChildren;
	}

	public Boolean getFlagged() {
		return flagged;
	}

	public void setFlagged(Boolean flagged) {
		this.flagged = flagged;
	}

	public Date getDue() {
		return due;
	}

	public void setDue(Date due) {
		this.due = due;
	}

	
}
