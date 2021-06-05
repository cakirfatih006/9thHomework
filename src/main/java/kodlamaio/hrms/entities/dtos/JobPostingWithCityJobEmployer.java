package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class JobPostingWithCityJobEmployer {
	@NotBlank
	@NotNull 
	private String companyName;
	
	@NotBlank
	@NotNull
	private String title;
	
	@NotBlank
	@NotNull
	private String city;
	

	
	@NotBlank
	@NotNull
	private String jobDetails;
	
	@NotBlank
	@NotNull
	private double minSalary;
	
	@NotBlank
	@NotNull
	private double maxSalary;
	
	@NotBlank
	@NotNull
	private int quotaPosition;
	
	@NotBlank
	@NotNull
	private LocalDate applicationDeadline;

	public JobPostingWithCityJobEmployer() {}
	
	public JobPostingWithCityJobEmployer(@NotBlank @NotNull String companyName, @NotBlank @NotNull String title,
			@NotBlank @NotNull String city, @NotBlank @NotNull String jobDetails, @NotBlank @NotNull double minSalary,
			@NotBlank @NotNull double maxSalary, @NotBlank @NotNull int quotaPosition,
			@NotBlank @NotNull LocalDate applicationDeadline) {
		super();
		this.companyName = companyName;
		this.title = title;
		this.city = city;
		this.jobDetails = jobDetails;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.quotaPosition = quotaPosition;
		this.applicationDeadline = applicationDeadline;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
	
	
	
	
}
