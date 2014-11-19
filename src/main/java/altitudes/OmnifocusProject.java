package altitudes;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class OmnifocusProject {
	
	public static enum Status {
		done,
		dropped,
		inactive
	}
	
	@XmlElement
	private OmnifocusReference folder;
	
	@XmlElement
	private Boolean singleton;
	
	@XmlElement
	private Status status;

	@XmlElement(name="last-review")
	private Date lastReview;
	
	@XmlElement(name="review-interval")
	private String reviewInterval;
	
	public OmnifocusReference getFolder() {
		return folder;
	}

	public void setFolder(OmnifocusReference folder) {
		this.folder = folder;
	}

	/**
	 * Indicates whether the project order is "Single Actions"
	 * 
	 * @return
	 */
	public Boolean getSingleton() {
		return singleton;
	}

	public void setSingleton(Boolean singleton) {
		this.singleton = singleton;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getLastReview() {
		return lastReview;
	}

	public void setLastReview(Date lastReview) {
		this.lastReview = lastReview;
	}

	public String getReviewInterval() {
		return reviewInterval;
	}

	public void setReviewInterval(String reviewInterval) {
		this.reviewInterval = reviewInterval;
	}
	

}
