package recursos;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException; 

public class ConexaoBD {
	public Connection getConnection() {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sistemaquadras","root","LpsDO12@");
		 }         
		 catch(SQLException | ClassNotFoundException excecao) {
			throw new RuntimeException(excecao);
		 }
    }
}
