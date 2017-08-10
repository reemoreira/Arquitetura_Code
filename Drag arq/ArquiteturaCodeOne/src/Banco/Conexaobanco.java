package Banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexaobanco {
	private static final String JDBC_DRIVER ="com.mysql.jdbl.Driver";
	//oracleprivate static final String JDBC_DRIVER ="oracle.jdbc.OracleDriver";
	//caminho do bd até nome do db (db_estudo)
	private static final String DATABASE_URL ="jdbc:mysqll://localhost:3306/db_estudo";
	// oracle private static final String DATABASE_URL ="jdbc:oracle:thin:@localhost:1521: XE";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";

	
	private Connection conexao;
	/*private String JDBC_DRIVE;
	private String DATABASE_URL;
	private String USERNAME;
	private String PASSWORD;*/
	private  static Conexaobanco instancia;
	
	private void ConexaoBanco(){
		String msg="";
		try{
			//qual é o drive que estamos utilizando 
			Class.forName(JDBC_DRIVER);
			// Conecta com o banco de dados
			conexao = DriverManager.getConnection(DATABASE_URL,
			USERNAME, PASSWORD);
			conexao.setAutoCommit(false);

		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			conexao = null;
			msg = "Driver não carregado";
			} catch (SQLException e) {
			e.printStackTrace();
			conexao = null;
			msg = "Conexão sem sucesso";
			} finally {
			if (msg != null) {
			System.err.println("\n " + msg);						
			}
		}
	}
	public static synchronized Conexaobanco getInstance(){
		if(instancia == null){
			instancia = new Conexaobanco();
		}
			return instancia;
			
	}
	public void conectar(){
		
		System.out.println("Conectei com o banco ! UHU!");		
	}
	public void desconectar(){
		try {
			conexao.close();
			System.out.println("Desconectei");
			} catch (SQLException e) {
			System.out.println("Conexão aberta, exceção: " +e.getMessage());
			e.printStackTrace();
			}		
			System.out.println("Desconectei com o banco !\nAté mais!");
		
	}
}


