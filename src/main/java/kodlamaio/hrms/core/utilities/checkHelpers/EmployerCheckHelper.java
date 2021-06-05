package kodlamaio.hrms.core.utilities.checkHelpers;


import kodlamaio.hrms.entities.concretes.Employer;

public class EmployerCheckHelper {
	
	
	public static boolean allFieldsNotNull(Employer employer) {
		if (employer.getCompanyName().isEmpty() || 
			employer.getEmail().isEmpty() ||
			employer.getPassword().isEmpty() || 
			employer.getWebAdress().isEmpty() || 
			employer.getPhoneNumber().isEmpty() 
			
			) {
			return false;
		}
		return true;
	}
	
	public static boolean samePassword(Employer employer) {
		if (!employer.getPassword().equals(employer.getRepeatPassword())) {
			
			return false;
		}
		return true;
	}
}
