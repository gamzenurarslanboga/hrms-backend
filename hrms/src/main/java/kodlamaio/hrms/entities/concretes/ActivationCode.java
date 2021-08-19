package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "activation_code")
public class ActivationCode {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "activation_code")
	private String activationCode;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	@Column(name = "user_id")
	private int user_id;
	
	public ActivationCode() {
		
	}
	
}
