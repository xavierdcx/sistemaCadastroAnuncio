package TesteSistemaCadastroAnuncio;

import org.junit.Test;

import conexaoBanco.conexaoBancoSistemaCadastroAnuncio;
import dao.daoAnuncio;
import model.Anuncio;

public class TesteUpdate {
    
	@Test
	public void atualizar() {
		
		try {
		
		daoAnuncio dao = new daoAnuncio();
		
		Anuncio objetoBanco = dao.buscar(3);
		
		objetoBanco.setNomeAnuncio("Jogo de Futsal");
		
		dao.atualizar(objetoBanco);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
