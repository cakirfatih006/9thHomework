package kodlamaio.hrms.entities.concretes;




import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="resume_langs")
public class Language {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name="resume_id")
	private Resume resume;
	
	@NotBlank(message="Boş Geçilemez")
	@Column(name="language")
	private String language;
	
	@NotBlank(message="Boş Geçilemez")
	@Column(name="lang_level")
	private char languageLevel;
	
	@Column(name="created_date")
	private LocalDate createdDate;

	public Language() {
		
	}
	
	

	



	public Language(int id, Resume resume, @NotBlank(message = "Boş Geçilemez") String language,
			@NotBlank(message = "Boş Geçilemez") char languageLevel, LocalDate createdDate) {
		super();
		this.id = id;
		this.resume = resume;
		this.language = language;
		this.languageLevel = languageLevel;
		this.createdDate = createdDate;
	}







	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public char getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(char languageLevel) {
		this.languageLevel = languageLevel;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	
	
	
}
