package conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexaoBancoSistemaCadastroAnuncio {
    
	/*Variaveis para fazer a ligação com banco*/
	private static String banco = "jdbc:postgresql://localhost:5432/cadastroAnuncio";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null; 
	/*Importando a interface Connection do pacote java.sql que contem
	 *  os metodos para fazer a conexão*/
	
	static { /*para aonde envocamos a classe de conexao o metodo conectar ser chamado*/
		conectar();
	}
	
	public conexaoBancoSistemaCadastroAnuncio() {
		conectar();
	}
    
	public static void conectar() {
	    try {
	      
	    	if(connection == null) {
	    		Class.forName("org.postgresql.Driver");
	    		/*Fazendo o carregamento do driver do postgresql*/
	    		connection = DriverManager.getConnection(banco, user, password);
	    		connection.setAutoCommit(false);/*Para não salvar automaticamente*/
	    		System.out.println("OPERAÇÕES REALIZADA COM SUCESSO");
	    	    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"); 
	    	}
	     	
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
		
	}
	
	
	public static Connection getConnection() {
		return connection;
	}
	
}

