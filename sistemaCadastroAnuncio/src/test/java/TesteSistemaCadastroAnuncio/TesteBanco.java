package TesteSistemaCadastroAnuncio;

import org.junit.Test;

import conexaoBanco.conexaoBancoSistemaCadastroAnuncio;

public class TesteBanco {
    
	@Test
	/*Inicializar o banco*/
	public void iniBanco() {
		conexaoBancoSistemaCadastroAnuncio.getConnection();
	}
	
}
