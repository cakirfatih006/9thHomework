package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kodlamaio.hrms.core.entities.User;


@Entity
@Table(name="verification_codes")
public class VerificationCode {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="verification_code")
	private String code;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	@Column(name="verified_date")
	private LocalDate verifiedDate;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id",referencedColumnName = "id", nullable = false)// referans eden colon -- boş olamaz
	private User user;
	
	public VerificationCode() {}
	
}
