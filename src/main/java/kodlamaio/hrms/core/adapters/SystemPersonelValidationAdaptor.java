package kodlamaio.hrms.core.adapters;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.abstracts.SystemPersonelValidationService;
import kodlamaio.hrms.core.entities.User;
@Service
public class SystemPersonelValidationAdaptor implements SystemPersonelValidationService{

	
	@Override
	public boolean isActivate(User User) {
		
		return true;
	}

}
