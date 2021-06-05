package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingWithCityJobEmployer;

@RestController
@RequestMapping("/api/jobpostings")
public class JobPostingController {

	private JobPostingService jobPostingService;
	
	@Autowired
	public JobPostingController (JobPostingService jobPostingService) {
		
		this.jobPostingService = jobPostingService;
		
	}
	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll() {
		
		return this.jobPostingService.getAll();
		
	}
	
	@GetMapping("/getallbyactivated")
	public DataResult<List<JobPosting>> getAllSortedByActivated() {
		
		return this.jobPostingService.getAllSortedByActivated();
		
	}
	
	@GetMapping("/getallbydate")
	public DataResult<List<JobPosting>> getAllSortedByDate() {
		
		return this.jobPostingService.getAllSortedByDate();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPostings) {
		
		return this.jobPostingService.add(jobPostings);
	}
	
	@PostMapping("/update")
	public Result update(JobPosting jobPostings) {
		
		return this.jobPostingService.update(jobPostings);
		
	}
		@GetMapping("/getJobPostingWithCityJobEmployer")
	public DataResult<List<JobPostingWithCityJobEmployer>> getJobPostingWithCityJobEmployer() {
		
		return this.jobPostingService.getJobPostingWithCityJobEmployer();
		
	}
	
}
