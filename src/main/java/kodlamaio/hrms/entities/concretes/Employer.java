package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.hrms.core.entities.User;




@Entity
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
@PrimaryKeyJoinColumn(name="id") 
public class Employer extends User{
	
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;

	@Column(name="phone_number")
	private String phoneNumber;
	
	/*@JsonIgnore
	@OneToMany(mappedBy= "employer")
	private List<JobPosting> jobPostings;*/

	public Employer(String companyName, String webAdress, String phoneNumber) {
		super();
		this.companyName = companyName;
		this.webAddress =webAdress;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	public Employer() {}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getWebAdress() {
		return webAddress;
	}


	public void setWebAdress(String webAddress) {
		this.webAddress = webAddress;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	
	
	
	
}
