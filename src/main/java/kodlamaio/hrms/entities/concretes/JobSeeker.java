package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_seekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "identity_number")
	private long identityNumber;
	
	@Column(name = "name")
	private char name;
	
	@Column(name = "surname")
	private char surname;
	
	@Column(name = "birthyear")
	private String birthYear;
	
	@Column(name = "is_confirmed")
	private boolean isConfirmed;
	
	@Column(name = "user_id")
	private int userId;
	
	public JobSeeker() {
		
	}
	
	
}
