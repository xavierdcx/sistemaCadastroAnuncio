package TesteSistemaCadastroAnuncio;

import java.util.List;

import org.junit.Test;

import conexaoBanco.conexaoBancoSistemaCadastroAnuncio;
import dao.daoAnuncio;
import model.Anuncio;

public class TesteDelete {
    
	@Test
	public void delete() {
		try {
			
			daoAnuncio dao = new daoAnuncio();
			
			dao.deletar(4);
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
