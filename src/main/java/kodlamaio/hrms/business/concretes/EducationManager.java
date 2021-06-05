package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.Education;
@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	
	
	
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		// TODO Auto-generated method stub
		educationDao.save(education);
		
		return new SuccessResult("başarıyla eklendi.");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		// TODO Auto-generated method stub
		return new DataSuccessResult<List<Education>>(this.educationDao.findAll(), "okul listesi getirildi.");
	}

	
	
	
}
