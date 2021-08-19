package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.dataAccess.abstarcts.ActivationCodeDao;
import kodlamaio.hrms.entities.concretes.ActivationCode;

public class ActivationManager implements ActivationCodeService {
	
	private ActivationCodeDao activationCodeDao;

	public ActivationManager(ActivationCodeDao activationCodeDao) {
		super();
		this.activationCodeDao = activationCodeDao;
	}

	@Override
	public List<ActivationCode> getAll() {
		
		return this.activationCodeDao.findAll();
	}

}
