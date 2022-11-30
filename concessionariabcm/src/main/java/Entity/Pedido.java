package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Builder
@Entity 
@Table  (name= "Pedido")

public class Pedido {
	
	@Id 
	@Column (name= "num_pedido")
	private String num_pedido;
	
	@Column (name= "descricao")
	private String descricao;
	
	@Column (name= "v_total")
	private long v_total;
	
	@ManyToOne
	@JoinColumn (name= "cod_clie")
	private long cod_clie;
	
    @ManyToOne
	@JoinColumn (name= "cpf_clie")
	private String cpf_clie;
	
	

}
