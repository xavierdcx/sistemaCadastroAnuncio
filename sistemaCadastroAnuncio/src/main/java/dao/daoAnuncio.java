package dao;

/*Importação do pacote java.sql para fazer persistência no banco de dados*/
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaoBanco.conexaoBancoSistemaCadastroAnuncio;
import model.Anuncio;

public class daoAnuncio {
   
	private Connection connection;

	public daoAnuncio() {
		connection = conexaoBancoSistemaCadastroAnuncio.getConnection();
	}
	
	/*Metodo para salvar dados no banco*/
	public void salvar(Anuncio anuncio) {
		try {
	     	
		String sql = "insert into anuncio (id, nomeAnuncio, cliente, "
				+ "datainicio, datatermino, investimentodia, "
				+ "maxCom, qpca, quantV) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement insert = connection.prepareStatement(sql);
		/*insert(Posição, Valores)*/
		insert.setInt(1, 1); /*ID*/
		insert.setString(2, "Filme de Luta"); /*Nome Anuncio*/
		insert.setString(3, "Netflix"); /*Cliente*/
	    insert.setString(4, "15/05/2021"); /*Data Inicio*/
	    insert.setString(5, "20/05/2021"); /*Data Termino*/
		insert.setInt(6, 10); /*Investimento Por Dia*/
		insert.setInt(7, 30); /*Maximo Compartilhamento*/
		insert.setInt(8, 50); /*Quantidade de cliques no anuncio*/
		insert.setInt(9, 40); /*Quantidade de vizualizações*/
		
		insert.execute();
		connection.commit();
		
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}

	public List<Anuncio> listar() throws Exception {
		List<Anuncio> list = new ArrayList<Anuncio>();
		
		String sql = "select * from anuncio";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		
		/*Enquanto estiver resultado ele ira mostrar na lista*/
		while(resultado.next()) {
			
			Anuncio anuncio = new Anuncio();
			anuncio.setId(resultado.getInt("id"));
			anuncio.setNomeAnuncio(resultado.getString("nomeAnuncio"));
			anuncio.setCliente(resultado.getString("cliente"));
			anuncio.setDatainicio(resultado.getString("datainicio"));
			anuncio.setDatatermino(resultado.getString("datatermino"));
			anuncio.setInvestimentodia(resultado.getInt("investimentodia"));
			anuncio.setMaxCom(resultado.getInt("maxCom"));
			anuncio.setQpca(resultado.getInt("qpca"));
			anuncio.setQuantV(resultado.getInt("quantV"));
			
			list.add(anuncio);
		}
		
		return list;
	}
	
	public Anuncio buscar(int id) throws Exception {
		Anuncio retorno = new Anuncio();
		
		String sql = "select * from anuncio where id = " + id; 
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();
		
		/*Retorna apenas um usuario ou nenhum*/
		while(resultado.next()) {
			
			
			retorno.setId(resultado.getInt("id"));
			retorno.setNomeAnuncio(resultado.getString("nomeAnuncio"));
			retorno.setCliente(resultado.getString("cliente"));
			retorno.setDatainicio(resultado.getString("datainicio"));
			retorno.setDatatermino(resultado.getString("datatermino"));
			retorno.setInvestimentodia(resultado.getInt("investimentodia"));
			retorno.setMaxCom(resultado.getInt("maxCom"));
			retorno.setQpca(resultado.getInt("qpca"));
			retorno.setQuantV(resultado.getInt("quantV"));
			
			
		}
		
		return retorno;
		
	
	}
	
	public void atualizar (Anuncio anuncio) {
		try {
		
		String sql = "update anuncio set nomeanuncio = ? where id = " + anuncio.getId();
		
		PreparedStatement statemnt = connection.prepareStatement(sql);
		statemnt.setString(1, anuncio.getNomeAnuncio());
		
		statemnt.execute();
		connection.commit();
		
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public void deletar(int id) {
		try {
			
			String sql = "delete from anuncio where id = " + id;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			
			connection.commit();
			
		} catch(Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public void resultInvestimentoTotal() {
		try {
			
			String sql = "select id, nomeanuncio, cliente, investimentodia, "
					+ "(investimentodia * 30)total ao from anuncio";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	
	
	
}
