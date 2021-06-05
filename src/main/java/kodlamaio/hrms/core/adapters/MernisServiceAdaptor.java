package kodlamaio.hrms.core.adapters;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.abstracts.MernisValidationService;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class MernisServiceAdaptor implements MernisValidationService{

	
	@Override
	public boolean isValidate(Candidate candidate) {
		
		return true;
	}

}
