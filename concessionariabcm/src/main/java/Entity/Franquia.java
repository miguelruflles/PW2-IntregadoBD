package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Builder
@Entity 
@Table  (name= "Franquia")

public class Franquia {
	
	@Id 
	@Column (name= "ender_fran")
	private String ender_fran;
	
	@Column (name= "cidade_fran")
	private String cidade_fran;
	
	@Column (name= "fone_fran")
	private String fone_fran;
	
}
