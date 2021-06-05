package kodlamaio.hrms.core.abstracts;

import kodlamaio.hrms.core.entities.User;

public interface EmailValidationService { // genel üye olma email kontrol
	
	
	boolean isActivate(User user);
	
}
