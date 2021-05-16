package TesteSistemaCadastroAnuncio;

import java.util.List;

import org.junit.Test;

import conexaoBanco.conexaoBancoSistemaCadastroAnuncio;
import dao.daoAnuncio;
import model.Anuncio;

public class TesteSelectFrom {
    
	@Test
	public void listarAnuncios() {
	  daoAnuncio dao= new daoAnuncio();
	  
	  try {
		List<Anuncio> list = dao.listar();
	    
		System.out.println("LISTA COM TODOS OS ANUNCIOS CADASTRADOS");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		for (Anuncio anuncio : list) {
			System.out.println(anuncio);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
	  } catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
