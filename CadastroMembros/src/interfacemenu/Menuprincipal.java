package interfacemenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Menuprincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menuprincipal frame = new Menuprincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menuprincipal() {
		setFont(new Font("Arial Black", Font.PLAIN, 14));
		setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(null);
		
		JFormattedTextField frmtdtxtfldControleDeMembros = new JFormattedTextField();
		frmtdtxtfldControleDeMembros.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldControleDeMembros.setForeground(SystemColor.desktop);
		frmtdtxtfldControleDeMembros.setFont(new Font("Arial Black", Font.PLAIN, 14));
		frmtdtxtfldControleDeMembros.setText("Controle de membros Ramo IEEE CEFET-RJ");
		frmtdtxtfldControleDeMembros.setBounds(89, 12, 348, 37);
		getContentPane().add(frmtdtxtfldControleDeMembros);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(142, 165, 6, 22);
		getContentPane().add(textPane);
	}
}
