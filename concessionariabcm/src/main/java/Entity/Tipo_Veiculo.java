package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Builder
@Entity 
@Table  (name= "Tipo_Veiculo") 

public class Tipo_Veiculo {
	
	@Id 
	@Column (name= "cod_tpveic")
	private String cod_tpveic;
	
	@Enumerated (EnumType.STRING)
	@Column (name= "categ_tpveic")
	private String categ_tpveic;
	
	@Column (name= "ano_tpveic")
	private String ano_tpveic;

}
