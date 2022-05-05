package Modulos;
import java.util.Scanner;
import javax. swing. JOptionPane;

public class cadastro_quadras {
	public static String quadras = "";
	public static void main (String [] args) {
		int continuar_loop;
				Scanner in = new Scanner(System.in); 
		
			do {
				System.out.println("Qual quadra deseja cadastrar ? "); 
				
				quadras += in.nextLine() + " " ;
							
				continuar_loop = JOptionPane.showConfirmDialog(null,"Deseja cadastrar mais quadras ?","Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null);
			
			} while(continuar_loop == JOptionPane.YES_OPTION);
		
				in.close();
		
			System.out.println("As quadras cadastradas são: " + quadras);
	}
}

	