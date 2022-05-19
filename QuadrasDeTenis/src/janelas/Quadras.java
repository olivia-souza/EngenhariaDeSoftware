package janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Quadras {

	private JFrame frmSummerTennis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quadras window = new Quadras();
					window.frmSummerTennis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quadras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSummerTennis = new JFrame();
		frmSummerTennis.setTitle("Summer Tennis");
		frmSummerTennis.setBounds(100, 100, 450, 300);
		frmSummerTennis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSummerTennis.getContentPane().setLayout(null);
	}
}
