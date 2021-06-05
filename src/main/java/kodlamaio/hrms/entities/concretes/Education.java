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


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Entity
@Table(name="resume_educations")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "education"})
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name="resume_id")
	private Resume resume;
	
	@Column(name="school_name")
	@NotBlank(message="Boş geçilemez")
	private String schoolName;
	
	
	@ManyToOne(targetEntity = Graduate.class )
	@JoinColumn(name = "graduate_id" , referencedColumnName = "id", nullable = false)
	private Graduate graduate;
	
	@Column(name="school_department")
	@NotBlank(message="Boş geçilemez")
	private String schoolDepartment;
	
	@Column(name="started_date")
	
	private LocalDate startedDate;
	
	@Column(name="ended_date")
	private LocalDate endedDate;
	
	
	
	@Column(name="created_date")
	private Date createdDate;

	public Education() {}

	public Education(int id, Resume resume, @NotBlank(message = "Boş geçilemez") String schoolName, Graduate graduate,
			@NotBlank(message = "Boş geçilemez") String schoolDepartment, LocalDate startedDate, LocalDate endedDate,
			Date createdDate) {
		super();
		this.id = id;
		this.resume = resume;
		this.schoolName = schoolName;
		this.graduate = graduate;
		this.schoolDepartment = schoolDepartment;
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



	public String getSchoolName() {
		return schoolName;
	}



	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}



	public Graduate getGraduate() {
		return graduate;
	}



	public void setGraduate(Graduate graduate) {
		this.graduate = graduate;
	}



	public String getSchoolDepartment() {
		return schoolDepartment;
	}



	public void setSchoolDepartment(String schoolDepartment) {
		this.schoolDepartment = schoolDepartment;
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



	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	

	
	
	
	
}
