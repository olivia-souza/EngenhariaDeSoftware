package janelas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txtNome;
	private JFrame frmSummerTennis_1;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frmSummerTennis;
		frmSummerTennis_1 = new JFrame();
		frmSummerTennis_1.setTitle("Summer Tennis");
		frmSummerTennis_1 = frmSummerTennis_1;
		frmSummerTennis_1.setTitle("Summer Tennis");
		frmSummerTennis_1.setBounds(100, 100, 450, 300);
		frmSummerTennis_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSummerTennis_1.getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBackground(Color.WHITE);
		txtNome.setToolTipText("");
		txtNome.setBounds(140, 125, 141, 20);
		frmSummerTennis_1.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNomeEmpresa = new JLabel("Clube Summer Tennis");
		lblNomeEmpresa.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNomeEmpresa.setBounds(140, 37, 141, 14);
		frmSummerTennis_1.getContentPane().add(lblNomeEmpresa);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblLogin.setBounds(195, 82, 31, 20);
		frmSummerTennis_1.getContentPane().add(lblLogin);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(208, 200, 73, 20);
		frmSummerTennis_1.getContentPane().add(btnEntrar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(140, 110, 46, 14);
		frmSummerTennis_1.getContentPane().add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(140, 156, 46, 14);
		frmSummerTennis_1.getContentPane().add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(140, 169, 141, 20);
		frmSummerTennis_1.getContentPane().add(txtSenha);
	}
}
