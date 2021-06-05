package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="education_graduates")

public class Graduate {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	
	@Column(name="description")
	@NotBlank(message="Açıklama Boş Geçilemez")
	private String description;
	
	/*@OneToMany(mappedBy = "school_id")
	private List<Resume> resumes;*/
	
	
	public Graduate() {}

	public Graduate(int id, @NotBlank(message = "Açıklama Boş Geçilemez") String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
}
