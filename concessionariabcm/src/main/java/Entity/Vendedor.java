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
@Table  (name= "Vendedor")
public class Vendedor {
	
	@Id
	@Column (name= "cpf_ven")
	private char cpf_ven;
	
	@Column (name= "nome_ven")
	private String nome_ven;
	
	@Column (name= "comissao")
	private long comissao;
	
	@Column (name= "matricula")
	private char matricula;
	
	
	

}
