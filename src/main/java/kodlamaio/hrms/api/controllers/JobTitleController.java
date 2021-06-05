package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;


@RestController					// JAVA olmayanlarda beni tanısın 
@RequestMapping("/api/jobs") // dışarıdan böyle bir istek gelirse bu kontrolör karşılayacak.
public class JobTitleController {

	
	private JobTitleService jobTitleService;
	
	
	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	
	
	@GetMapping("/getall")				
	public DataResult<List<JobTitle>> getAll() {

		return this.jobTitleService.getAll();

}


	
	
}
