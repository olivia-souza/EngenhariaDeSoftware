package dominio;

import java.util.Scanner;

public class Menu {
	int opcao = 0;
	Scanner entrada = new Scanner(System.in);

	public void MenuAdministrador() {
		do {
			System.out.println("==================== Menu ====================");
			System.out.println("1.Quadras");
			System.out.println("2.Usuários");
			System.out.println("3.Desempenho");
			System.out.println("4.Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				MenuAdministradorQuadra();
				break;
			case 2:
				MenuAdministradorUsuario();
				break;
			case 4:
				break;
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		} while (opcao != 4);
	}

	public void MenuAdministradorQuadra() {
		do {
			System.out.println("==================== Menu de Quadras ====================");
			System.out.println("1.Cadastrar");
			System.out.println("2.Alterar");
			System.out.println("3.Desabilitar");
			System.out.println("4.Bloquear");
			System.out.println("5.Desbloquear");
			System.out.println("6.Visualizar");
			System.out.println("7.Voltar");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				MenuAdministrador();
				break;
			default:
				System.out.println("Digite uma opção válida!");
			}

		} while (opcao != 7);
	}

	public void MenuAdministradorUsuario() {
		do {
			System.out.println("==================== Menu de Usuários ====================");
			System.out.println("1.Cadastrar");
			System.out.println("2.Alterar");
			System.out.println("3.Desabilitar");
			System.out.println("4.Bloquear");
			System.out.println("5.Desbloquear");
			System.out.println("6.Visualizar");
			System.out.println("7.Voltar");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				MenuAdministrador();
				break;
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}

		} while (opcao != 7);
	}

	public void Desempenho() {
		do {
			System.out.println("==================== Menu de Desempenho ====================");
			System.out.println("1.Ocupação média");
			System.out.println("2.Ganho médio");
			System.out.println("3.Ganho por período");
			System.out.println("4.Voltar");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				MenuAdministrador();
				break;
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		} while (opcao != 4);
	}

	public void MenuZelador() {

	}
}
