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
@Table  (name= "Fornecedora")

public class Fornecedora {
	
	@Id 
	@Column (name= "cnpj_forn")
	private String cnpj_forn;
	
	@Column (name= "nome_forn")
	private String nome_forn;
	
	@Column (name= "r_social_forn")
	private String r_social_forn;
	
	@Column (name= "ie_forn")
	private String ie_forn;
	
	@Column (name= "fone_forn")
	private String fone_forn;

	
}
