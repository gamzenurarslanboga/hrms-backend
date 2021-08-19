package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeService  {
	List<ActivationCode> getAll();
}
