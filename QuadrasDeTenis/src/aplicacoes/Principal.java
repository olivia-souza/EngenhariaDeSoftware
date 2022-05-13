package aplicacoes;

public class Principal {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		Quadra q = new Quadra();
		
		System.out.println("Nome: "+ user.getNome() + "\nCPF: " + user.getCPF() + "\nE-mail: " + user.getEmail() + "\nTelefone: " + user.getTelefone());
		System.out.println("\n");
		System.out.println("Numero: "+ q.getNumero() + "\nTipo: " + q.getTipo_Quadras() + "\nEh Coberta: " + q.isCoberta() + "\nTem Arquibancada: " + q.isArquibancada() + "\nTem Bancos: " + q.isBanco());
	}

}