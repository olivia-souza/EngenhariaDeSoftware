package aplicacoes;
import dominio.*;
import java.util.Scanner;

public class CadastroUsuario extends Usuario {
	
	public void cadastrarUsuario(){
		Scanner receber = new Scanner (System.in);
				
		do{
			System.out.println("Digite seu nome: ");
			nome = receber.nextLine();
		}while (nome.length() < 4 || nome.length() > 50 );	
			
		do{
			System.out.println("Digite seu cpf: ");
			cpf = receber.nextLine();
		}while (cpf.length() != 11);
				
		System.out.println("Digite seu email: ");
		email = receber.nextLine();
				
		System.out.println("Digite sua senha: ");
		senha = receber.nextLine();
				
	}
}
