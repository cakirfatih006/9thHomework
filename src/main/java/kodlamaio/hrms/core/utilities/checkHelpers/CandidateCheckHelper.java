package kodlamaio.hrms.core.utilities.checkHelpers;

import kodlamaio.hrms.entities.concretes.Candidate;


public class CandidateCheckHelper {

	public static boolean allFieldsNotNull(Candidate candidate) {
		
		if (	candidate.getEmail().isEmpty() ||
			candidate.getFirstName().isEmpty() ||
			candidate.getIdentityNumber().isEmpty() ||
			candidate.getLastName().isEmpty() ||
			candidate.getPassword().isEmpty()
			
				) {
			return false;
			
			
		}
		return true;
		
	}
	
	public static boolean samePassword(Candidate candidate) {
		if (!candidate.getPassword().equals(candidate.getRepeatPassword())) {
			
			return false;
		}
		return true;
		
	}
	
}
