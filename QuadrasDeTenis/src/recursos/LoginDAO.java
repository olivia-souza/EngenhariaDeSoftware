package recursos;
import dominio.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	private Connection connection;
	
	public LoginDAO(){ 
        this.connection = new ConexaoBD().getConnection();
    }
	
	public Usuario login(String nome, String senha) throws SQLException{
		Usuario usuario = null;
		String sql = "SELECT * FROM usuario WHERE nome = ? AND senha";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setString(2, senha);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			usuario = new Usuario();
			usuario.setNome(rs.getString("NOME"));
		}
		return usuario;
	}
		
}
