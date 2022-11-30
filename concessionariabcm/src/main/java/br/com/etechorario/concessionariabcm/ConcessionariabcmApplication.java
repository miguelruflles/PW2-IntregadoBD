package br.com.etechorario.concessionariabcm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Entity.Forma_pgto;
import Repository.Forma_pgtoRepository;
import Repository.FornecedoraRepository;
import Repository.FranquiaRepository;

@SpringBootApplication
public class ConcessionariabcmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConcessionariabcmApplication.class, args);
	}
	
	/*@Autowired
	private Forma_pgtoRepository fpgtoRepository;
	
	
	@Override
	public void run(String...  args) throws Exception{
		Forma_pgto fpgto = Forma_pgto.builder().dt_pgto("28/11/2022").nome_pgto("A_VISTA").num_pgto("1").build();
		fpgtoRepository.save(fpgto);
	}*/
	
	@Autowired
	private FornecedoraRepository fornRepository;
	
	
	/*@Override
	public void run(String...  args) throws Exception{
		Fornecedora forn = Fornecedora.builder().cnpj_forn("19473046604651").nome_forn("Volkswagen")
				.r_social_forn("BCM S.A").ie_forn("12g2d2").fone_forn("11981888812").build();
		fornRepository.save(forn);
	}*/
	
	@Autowired
	private FranquiaRepository franquiaRepository;
	
	
	/*@Override
	public void run(String...  args) throws Exception{
		Franquia franq = Franquia.builder().ender_fran("Alcantara, 113").cidade_fran("SÃO PAULO").fone_fran("11987314176").build();
		franquiaRepository.save(franq);
	}*/

}
