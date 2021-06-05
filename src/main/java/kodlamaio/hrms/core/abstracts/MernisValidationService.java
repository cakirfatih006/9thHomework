package kodlamaio.hrms.core.abstracts;

import kodlamaio.hrms.entities.concretes.Candidate;

public interface MernisValidationService{ // iş arayan mernis kontrol
	
	boolean isValidate(Candidate candidate);
}
