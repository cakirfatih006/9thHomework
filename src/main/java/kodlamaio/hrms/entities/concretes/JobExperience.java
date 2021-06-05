package kodlamaio.hrms.entities.concretes;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="resume_job_experiences")
public class JobExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name="resume_id")
	private Resume resume;
	
	@NotBlank(message="Açıklama Boş Geçilemez")
	@Column(name="company_name")
	private String companyName;
	
	
	@NotBlank(message="Açıklama Boş Geçilemez")
	@Column(name="position")
	private String jobPosition; // jobtitle dan  getirebiliriz -- target + lazy
	
	
	@Column(name="started_date")
	private LocalDate startedDate;
	
	@Column(name="ended_date")
	private LocalDate endedDate;
	
	
	
	@Column(name="created_date")
	private LocalDate createdDate;

	
	
	
	public JobExperience() {
		
	}




	public JobExperience(int id, Resume resume, @NotBlank(message = "Açıklama Boş Geçilemez") String companyName,
			@NotBlank(message = "Açıklama Boş Geçilemez") String jobPosition,
			 LocalDate startedDate, LocalDate endedDate,
			LocalDate createdDate) {
		super();
		this.id = id;
		this.resume = resume;
		this.companyName = companyName;
		this.jobPosition = jobPosition;
		this.startedDate = startedDate;
		this.endedDate = endedDate;
		this.createdDate = createdDate;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Resume getResume() {
		return resume;
	}




	public void setResume(Resume resume) {
		this.resume = resume;
	}




	public String getCompanyName() {
		return companyName;
	}




	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}




	public String getJobPosition() {
		return jobPosition;
	}




	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}




	public LocalDate getStartedDate() {
		return startedDate;
	}




	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}




	public LocalDate getEndedDate() {
		return endedDate;
	}




	public void setEndedDate(LocalDate endedDate) {
		this.endedDate = endedDate;
	}




	public LocalDate getCreatedDate() {
		return createdDate;
	}




	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}




	

	
	
	
	
	
}
