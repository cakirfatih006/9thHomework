package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.adapters.EmailValidationAdapter;
import kodlamaio.hrms.core.adapters.SystemPersonelValidationAdaptor;

import kodlamaio.hrms.core.utilities.checkHelpers.EmployerCheckHelper;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private UserDao userDao;
	private EmailValidationAdapter emailValidationAdapter;
	private SystemPersonelValidationAdaptor systemPersonelValidationAdaptor;
	
	
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, UserDao userDao, EmailValidationAdapter emailValidationAdapter,
			SystemPersonelValidationAdaptor systemPersonelValidationAdaptor) {
		super();
		this.employerDao = employerDao;
		this.userDao = userDao;
		this.emailValidationAdapter = emailValidationAdapter;
		this.systemPersonelValidationAdaptor = systemPersonelValidationAdaptor;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new DataSuccessResult<List<Employer>>(this.employerDao.findAll(), "İş verenler getirildi : listeleme başarılı");
	}

	@Override
	public Result add(Employer employer) {

		if (!EmployerCheckHelper.allFieldsNotNull(employer)) {
			return new ErrorResult("Tüm alanları doldurunuz.");
		}else if(!(emailValidationAdapter.isActivate(employer)
				&& systemPersonelValidationAdaptor.isActivate(employer))) {
			return new ErrorResult("aktivasyon sağlanmadı.");
			
			
		}else if(userDao.findByEmail(employer.getEmail()) != null) {
			return new ErrorResult("Kullanıcı Zaten Kayıtlı");
		
			
		}
		
		else if (!EmployerCheckHelper.samePassword(employer)) {
			return new ErrorResult("Şifreler eşleşmiyor.");
		}
		this.employerDao.save(employer);
		
		return new SuccessResult("İş veren kaydı başarılı.");
	}

}
