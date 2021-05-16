package TesteSistemaCadastroAnuncio;

import org.junit.Test;

import conexaoBanco.conexaoBancoSistemaCadastroAnuncio;
import dao.daoAnuncio;
import model.Anuncio;

public class TesteInsert {
    
	@Test
	public void inserirNoBanco() {
		daoAnuncio daoAnuncio = new daoAnuncio();
		Anuncio anuncio = new Anuncio();
		
		daoAnuncio.salvar(anuncio);
	}
	
}
