package janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;

public class PaginaInicialAdm {

	private JFrame frmSummerTenis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicialAdm window = new PaginaInicialAdm();
					window.frmSummerTenis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaginaInicialAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSummerTenis = new JFrame();
		frmSummerTenis.setTitle("Summer Tennis");
		frmSummerTenis.setBounds(100, 100, 450, 300);
		frmSummerTenis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSummerTenis.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("P\u00E1gina Inicial");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel.setBounds(170, 36, 92, 18);
		frmSummerTenis.getContentPane().add(lblNewLabel);
		
		JButton btnNovoCadastro = new JButton("Novo Cadastro");
		btnNovoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNovoCadastro.setBounds(156, 86, 120, 23);
		frmSummerTenis.getContentPane().add(btnNovoCadastro);
		
		JButton btnVisualizarListas = new JButton("Visualizar Listas");
		btnVisualizarListas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVisualizarListas.setBounds(156, 120, 120, 23);
		frmSummerTenis.getContentPane().add(btnVisualizarListas);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRelatorios.setBounds(156, 154, 120, 23);
		frmSummerTenis.getContentPane().add(btnRelatorios);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(173, 188, 89, 23);
		frmSummerTenis.getContentPane().add(btnNewButton);
	}
}
