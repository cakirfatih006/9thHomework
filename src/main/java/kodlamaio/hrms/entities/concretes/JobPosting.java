package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="job_postings")
public class JobPosting {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
		/*@Column(name="job_title_id")
		private int jobTitleId;*/
	
		/*@Column(name="employer_id")
		private int employerId;*/
	
		/*@Column(name="city_id")
		private int cityId;*/
	
	/*@ManyToOne(targetEntity = JobTitle.class)
	@JoinColumn(name="job_titles_id")
	private JobTitle jobTitle;
	
	@ManyToOne(targetEntity = Employer.class)
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne(targetEntity = City.class)
	@JoinColumn(name="city_id")
	private City city;*/
	
	@ManyToOne(targetEntity = City.class, fetch = FetchType.LAZY)
	@JoinColumn(name="city_id",referencedColumnName = "id", nullable = false)
	private City city;
	
	
	@ManyToOne(targetEntity = Employer.class, fetch = FetchType.LAZY)
	@JoinColumn(name="employer_id",referencedColumnName = "id", nullable = false)
	private Employer employer;
	
	
	@ManyToOne(targetEntity = JobTitle.class, fetch = FetchType.LAZY)
	@JoinColumn(name="job_titles_id",referencedColumnName = "id", nullable = false)
	private JobTitle jobTitle;
	
	@Column(name="job_details")
	private String jobDetails;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="quota_position")
	private int quotaPosition;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="is_activated")
	private boolean isActivated;
	
	@Column(name="created_date",updatable = false)
	/*@CreationTimestamp 
	@Temporal(TemporalType.DATE)*/
	private LocalDate createdDate;

	public JobPosting() {}

	
	
	public JobPosting(int id, City city, Employer employer, JobTitle jobTitle, String jobDetails, double minSalary,
			double maxSalary, int quotaPosition, LocalDate applicationDeadline, boolean isActivated,
			LocalDate createdDate) {
		super();
		this.id = id;
		this.city = city;
		this.employer = employer;
		this.jobTitle = jobTitle;
		this.jobDetails = jobDetails;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.quotaPosition = quotaPosition;
		this.applicationDeadline = applicationDeadline;
		this.isActivated = isActivated;
		this.createdDate = createdDate;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getQuotaPosition() {
		return quotaPosition;
	}

	public void setQuotaPosition(int quotaPosition) {
		this.quotaPosition = quotaPosition;
	}

	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	
	

}
