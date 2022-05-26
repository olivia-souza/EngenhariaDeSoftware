package aplicacoes;
import java.sql.*;
import java.util.*;
import recursos.ConexaoBD;
import dominio.*;

public class Login extends Usuario {
	Scanner entrada = new Scanner(System.in);
	
	public Login() {
		
	}
	
	public void recebeDados() {
		System.out.println("Login");
		System.out.println("Usuário: ");
		nome = entrada.next();
		System.out.println("Senha: ");
		senha = entrada.next();
	}
	
	private static final String LOGIN_SQL = "SELECT nome FROM usuario WHERE nome = ?";
	
	public boolean verificaDados(String login) throws SQLException{
		PreparedStatement st = null;
		try	(
			Connection c = ConexaoBD.getConnection();
			PreparedStatement ps = c.prepareStatement(LOGIN_SQL)
		){
			ps.setString(1, login);
			try (ResultSet rs = st.executeQuery()){
				return rs.next();
			}
		}
	}
}
