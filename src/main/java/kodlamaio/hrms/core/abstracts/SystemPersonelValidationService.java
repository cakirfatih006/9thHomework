package kodlamaio.hrms.core.abstracts;

import kodlamaio.hrms.core.entities.User;

public interface SystemPersonelValidationService { // sistem personeli tarafından işverene ve iş arayana onay.

	
		boolean isActivate(User User);
}
