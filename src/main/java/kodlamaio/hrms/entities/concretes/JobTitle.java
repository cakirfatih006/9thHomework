package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"}) // tembel
public class JobTitle {
	
	
	@Id							
	@GeneratedValue	(strategy = GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;
	
	@Column(name="title")
	private String title;
	
	/*@JsonIgnore
	@OneToMany(mappedBy ="jobTitle")
	private List<JobPosting> jobPostings;*/
	
	public JobTitle() {}

	

	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}




	
	
	
	
	
}
