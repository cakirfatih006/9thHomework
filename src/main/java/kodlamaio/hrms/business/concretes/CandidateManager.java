package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.abstracts.MernisValidationService;
import kodlamaio.hrms.core.adapters.EmailValidationAdapter;
import kodlamaio.hrms.core.utilities.checkHelpers.CandidateCheckHelper;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	private UserDao userDao;
	private MernisValidationService mernisValidationService;
	private EmailValidationAdapter emailValidationAdapter;
	
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserDao userDao, MernisValidationService mernisValidationService,
			EmailValidationAdapter emailValidationAdapter) {
		super();
		this.candidateDao = candidateDao;
		this.userDao = userDao;
		this.mernisValidationService = mernisValidationService;
		this.emailValidationAdapter = emailValidationAdapter;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new DataSuccessResult<List<Candidate>>(this.candidateDao.findAll(), "İş arayan listesi getirildi.");
	}

	@Override
	public Result add(Candidate candidate) {
		
		if (!CandidateCheckHelper.allFieldsNotNull(candidate)) {
			return new ErrorResult("Tüm alanları doldurunuz.");
			
		
		}else if(!mernisValidationService.isValidate(candidate)) {
			return new ErrorResult("Mernis Doğrulaması Başarısız Bilgilerinizi Kontrol Ediniz");
			
		}else if(userDao.findByEmail(candidate.getEmail()) != null 
				|| candidateDao.findByIdentityNumber(candidate.getIdentityNumber())!= null) {
			return new ErrorResult("Kullanıcı Zaten Kayıtlı");
			
		}else if(!emailValidationAdapter.isActivate(candidate)) {
			return new ErrorResult("Aktivasyon kodu yanlış veya eksik");
			
		}else if (!CandidateCheckHelper.samePassword(candidate)) {
			return new ErrorResult("Şifreler eşleşmiyor.");
		}
		
		
		else {
			this.candidateDao.save(candidate);
			return new SuccessResult("Kayıt Başarılı");
		}
	}

}
