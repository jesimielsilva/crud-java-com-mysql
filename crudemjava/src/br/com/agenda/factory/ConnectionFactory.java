package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Nome do usuario do mysql
	private static final String USERNAME = "root";
	
	//senha do banco
	private static final String PASSWORD = "";
	
	//caminho do banco de dados, porta
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	/*
	 * Conexão com o banco de dados
	 */
	
	public static Connection createConnectionToMySQL() throws Exception {
		//Faz com que a classe seja carregada pela JBVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Criar a conexao com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
		
	}
	
	public static void main(String[] args) throws Exception {
		//recuperar uma conexao com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//testar se a conexao é nula
		if(con != null) {
			System.out.println("Conexão obitida com sucesso!");
			con.close();
		}
		
	}

}
