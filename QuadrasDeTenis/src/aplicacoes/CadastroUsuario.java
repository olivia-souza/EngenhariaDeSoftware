package aplicacoes;

import java.util.Scanner;

public class CadastroUsuario {
	
		private static String Nome, cpf, email, senha;
		
		public static void main (String [] args ) {
				Scanner receber = new Scanner (System.in);
				
				do{
				System.out.println("Digite seu nome: ");
				Nome = receber.nextLine();
				}while (Nome.length() < 4 || Nome.length() > 50 );	
				
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
