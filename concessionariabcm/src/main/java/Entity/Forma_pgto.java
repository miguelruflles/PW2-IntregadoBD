package Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table  (name= "Forma_pgto") 

public class Forma_pgto {
	
	@Id 
	@Column (name= "cod_pgto")
	private String cod_pgto;
	
	@Column (name= "dt_pgto")
	private LocalDateTime dt_pgto;
	
	@Enumerated (EnumType.STRING)
	@Column  (name= "nome_pgto")
	private Forma_pgto nome_pgto;
	
	@ManyToOne
	@JoinColumn (name= "num_pgto")
	private String num_pgto;
	

}
