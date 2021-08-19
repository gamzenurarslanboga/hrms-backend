package kodlamaio.hrms.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer>{

}
