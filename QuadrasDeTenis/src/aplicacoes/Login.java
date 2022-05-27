package aplicacoes;
import java.sql.SQLException;
import java.util.*;
import recursos.*;
import dominio.*;

public class Login extends Usuario {
	Scanner entrada = new Scanner(System.in);
	
	public void recebeDados() {
		System.out.println("Login");
		System.out.println("Usu�rio: ");
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
			System.out.println("Usu�rio n�o existente ou dados incorretos");
		}
	}
	
}
