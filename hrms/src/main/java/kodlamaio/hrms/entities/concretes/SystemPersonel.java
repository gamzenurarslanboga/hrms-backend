package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "system_personel")
public class SystemPersonel {
	
	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id;
	
	@Column(name= "user_id")
	private int user_id;
	
	public SystemPersonel() {
		
	}
}
