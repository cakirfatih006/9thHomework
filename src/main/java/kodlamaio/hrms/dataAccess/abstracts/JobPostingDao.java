package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingWithCityJobEmployer;


public interface JobPostingDao extends JpaRepository<JobPosting, Integer>{

	@Query("From JobPosting where isActivated=true")
	List<JobPosting> getByIsActivated();
	
	
	
	//DTO
	@Query("select new kodlamaio.hrms.entities.dtos.JobPostingWithCityJobEmployer"
			+ "(e.companyName,"
			+ "t.title,c.city,"
			+ "j.jobDetails,"
			+ "j.minSalary,"
			+ "j.maxSalary,"
			+ "j.quotaPosition,"
			+ "j.applicationDeadline) " +
            "from JobPosting j inner join j.employer e inner join j.jobTitle t inner join j.city c")		
		 List<JobPostingWithCityJobEmployer> getJobPostingWithCityJobEmployer();										
		 
		 // select * from Category c inner join Product p 
		 // on c.categoryId = p.categoryId
	
}
