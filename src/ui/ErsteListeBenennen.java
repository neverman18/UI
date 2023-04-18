package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class ErsteListeBenennen extends JFrame {

	private JPanel contentPane;
	private JTextField gruppenNamenBeispiel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErsteListeBenennen frame = new ErsteListeBenennen();
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
	public ErsteListeBenennen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrWenErstellst = new JLabel("Für wen erstellst du");
		lblFrWenErstellst.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFrWenErstellst.setBounds(10, 45, 250, 38);
		contentPane.add(lblFrWenErstellst);
		
		JLabel lblDeineListe = new JLabel("deine Liste?");
		lblDeineListe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDeineListe.setBounds(10, 80, 250, 38);
		contentPane.add(lblDeineListe);
		
		JLabel gruppenName = new JLabel("Gruppenname");
		gruppenName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gruppenName.setBounds(10, 158, 250, 38);
		contentPane.add(gruppenName);
		
		gruppenNamenBeispiel = new JTextField();
		gruppenNamenBeispiel.setText("z.B. Familie Raab");
		gruppenNamenBeispiel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gruppenNamenBeispiel.setBounds(10, 193, 250, 31);
		contentPane.add(gruppenNamenBeispiel);
		gruppenNamenBeispiel.setColumns(10);
		
		JLabel familyIcon = new JLabel("");
		familyIcon.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\familyIcon.png"));
		familyIcon.setHorizontalAlignment(SwingConstants.CENTER);
		familyIcon.setBounds(76, 247, 110, 112);
		contentPane.add(familyIcon);
		
		JButton weiterButton = new JButton("Weiter ->");
		weiterButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		weiterButton.setBackground(new Color(176, 196, 222));
		weiterButton.setBounds(35, 403, 196, 40);
		contentPane.add(weiterButton);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(176, 196, 222));
		separator.setBounds(0, 125, 285, 8);
		contentPane.add(separator);
	}

}
