package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingWithCityJobEmployer;
@Service
public class JobPostingManager implements JobPostingService{

	private JobPostingDao jobPostingDao;
	
	
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}
	

	@Override
	public DataResult<List<JobPosting>> getAll() {
		
		return new DataSuccessResult<List<JobPosting>>(this.jobPostingDao.findAll(),"Tüm iş ilanları getirildi.");
	}


	@Override
	public DataResult<List<JobPosting>> getAllSortedByActivated() {
		
		return new DataSuccessResult<List<JobPosting>>(this.jobPostingDao.getByIsActivated(), "Aktif iş ilanları getirildi.");
	}


	@Override
	public DataResult<List<JobPosting>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"appDeadline");
		return new DataSuccessResult<List<JobPosting>>(this.jobPostingDao.findAll(sort));
	}


	@Override
	public Result add(JobPosting jobPostings) {
		this.jobPostingDao.save(jobPostings);
		return new SuccessResult("iş ilanı eklendi.");
	}


	@Override
	public Result update(JobPosting jobPostings) {
		this.jobPostingDao.save(jobPostings);
		return new SuccessResult("iş ilanı güncellendi.");
	}


	@Override
	public DataResult<List<JobPostingWithCityJobEmployer>> getJobPostingWithCityJobEmployer() {
		
		return new DataSuccessResult<List<JobPostingWithCityJobEmployer>>(this.jobPostingDao.getJobPostingWithCityJobEmployer(), "Dto geldi.");
	}
	
	
	
}
