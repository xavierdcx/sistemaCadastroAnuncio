package TesteSistemaCadastroAnuncio;

import java.util.List;

import org.junit.Test;

import conexaoBanco.conexaoBancoSistemaCadastroAnuncio;
import dao.daoAnuncio;
import model.Anuncio;

public class TesteSelectPorID {
    
	@Test
	public void buscar() {
		
		daoAnuncio dao = new daoAnuncio();
		
		try {
			Anuncio anuncio = dao.buscar(4);
		    
			System.out.println(anuncio);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
