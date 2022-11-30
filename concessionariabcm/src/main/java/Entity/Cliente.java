package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter
@Builder
@Entity 
@Table  (name= "Cliente")
public class Cliente {
	
	@Id 
	@Column (name= "cod_clie")
	private long cod_clie;
	
	@Column (name= "ender_clie")
	private String ender_clie;
	
	@Column  (name = "bairro_clie")
	private String bairro_clie;
	
	@Column (name= "cidade_clie")
	private String cidade_clie;
	
	@Column (name= "cep_clie")
	private String cep_clie;
	
	@Column (name= "uf_clie")
	private String uf_clie;
	
	@Column (name= "cpf_clie")
	private String cpf_clie;
	
	@Column (name = "nome_clie")
	private String nome_clie;
	
	@Column (name= "cnh_clie")
	private String cnh_clie;
	
	@Column (name="cnpj_clie")
	private String cnpj_clie;
	
	@Column (name = " rsocial_clie")
	private String rsocial_clie;
	
	@Column (name = "nm_emp_clie")
	private String nm_emp_clie;
	
	@Column (name = "ie_clie")
    private String ie_clie;
	
}
