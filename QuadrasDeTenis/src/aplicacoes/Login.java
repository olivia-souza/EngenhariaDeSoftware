package aplicacoes;
import java.sql.SQLException;
import java.util.*;
import recursos.ConexaoBD;

public class Login extends Usuario {
	Scanner entrada = new Scanner(System.in);
	
	public Login() {
		System.out.println("Login");
		System.out.println("Usuário: ");
		nome = entrada.next();
		System.out.println("Senha: ");
		senha = entrada.next();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT nome FROM usuario WHERE nome = nome");
		
		if (rs.next()) {
			
		}
	}
}
