package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.TechnologyDao;

import kodlamaio.hrms.entities.concretes.Technology;
@Service
public class TechnologyManager implements TechnologyService{

	private TechnologyDao technologyDao;
	
	
	@Autowired
	public TechnologyManager(TechnologyDao technologyDao) {
		super();
		this.technologyDao = technologyDao;
	}

	@Override
	public DataResult<List<Technology>> getAll() {
		
		return new DataSuccessResult<List<Technology>>(this.technologyDao.findAll(), "teknolohiler getirildi.");
	}

	@Override
	public Result add(Technology technology) {
		this.technologyDao.save(technology);
		return new SuccessResult("başarıyla eklendi.");
	}

	
	
}
