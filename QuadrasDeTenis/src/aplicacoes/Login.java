package aplicacoes;
import java.sql.SQLException;
import java.util.*;
import recursos.*;
import dominio.*;

public class Login extends Usuario {
	Scanner entrada = new Scanner(System.in);
	
	public void recebeDados() {
		System.out.println("Login");
		System.out.println("Usuário: ");
		nome = entrada.next();
		System.out.println("Senha: ");
		senha = entrada.next();
		
		Usuario usuario = null;
		try {
			usuario = new LoginDAO().login("fulano","senha123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(usuario == null) {
			System.out.println("Usuário não existente ou dados incorretos");
		}
	}
	
}
