package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPosting"})
public class City {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="city")
	private String city;
	
	
	/*@JsonIgnore
	@OneToMany(mappedBy = "city")
	private List<JobPosting> jobPostings;*/
	
	public City() {}

	

	public City(int id, String city) {
		super();
		this.id = id;
		this.city = city;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	

	
	
	
	
}
