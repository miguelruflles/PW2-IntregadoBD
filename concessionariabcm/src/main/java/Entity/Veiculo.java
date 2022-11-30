package Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Builder
@Entity 
@Table  (name= "Veiculo")

public class Veiculo{
	
	@Id 
	@Column (name= "chassi")
	private String chassi;
	
	@Column (name= "modelo")
	private String modelo;
	
	@Column (name= "marca")
	private String marca;
	
	@Column (name= "valor_veic")
	private long valor_veic;
	
	@Column (name= "km_veic")
	private long km_veic;
	
	@ManyToOne
	@JoinColumn (name= "cnpj_forn")
	private String cnpj_forn;
	
	@ManyToOne
	@JoinColumn (name= "cod_tpveic")
	private String cod_tpveic;
	
	@ManyToOne
	@JoinColumn (name= "num_pedido")
	private String num_pedido;
	
	@ManyToOne
	@JoinColumn (name= "ender_fran")
	private String ender_fran;
	
	@ManyToMany
	@JoinTable(name = "Forn_Veic", joinColumns = {@JoinColumn(name = "chassi")}, inverseJoinColumns = 
	{@JoinColumn(name = "cnpj_forn")})
	private List<Fornecedora> Fornecedores;
}
