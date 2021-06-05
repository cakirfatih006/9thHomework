package kodlamaio.hrms.entities.concretes;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="resumes")
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@ManyToOne(targetEntity = Candidate.class )
	@JoinColumn(name = "candidate_id" , referencedColumnName = "id", nullable = false)
	private Candidate candidate;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linked_link")
	private String linkedLink;
	
	@Column(name="photo")
	private String photoLink;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="updated_date")
	private LocalDate updatedDate;
	
	@Column(name="is_active")
	private boolean isActive=true;
	
	
	@OneToMany(mappedBy ="resume")
	private List<Language> languages;
	
	@OneToMany(mappedBy ="resume")
	private List<Technology> technologies;
	
	@OneToMany(mappedBy ="resume")
	private List<JobExperience> jobExperience;
	
	@OneToMany(mappedBy ="resume")
	private List<Education> educations;

	public Resume(int id, Candidate candidate, String githubLink, String linkedLink, String photoLink,
			String description, LocalDate createdDate, LocalDate updatedDate, boolean isActive, List<Language> languages,
			List<Technology> technologies, List<JobExperience> jobExperience, List<Education> educations) {
		super();
		this.id = id;
		this.candidate = candidate;
		this.githubLink = githubLink;
		this.linkedLink = linkedLink;
		this.photoLink = photoLink;
		this.description = description;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.isActive = isActive;
		this.languages = languages;
		this.technologies = technologies;
		this.jobExperience = jobExperience;
		this.educations = educations;
	}

	public Resume() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getLinkedLink() {
		return linkedLink;
	}

	public void setLinkedLink(String linkedLink) {
		this.linkedLink = linkedLink;
	}

	public String getPhotoLink() {
		return photoLink;
	}

	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public List<JobExperience> getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(List<JobExperience> jobExperience) {
		this.jobExperience = jobExperience;
	}

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}
	
	
	
	
}
