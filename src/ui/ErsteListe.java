package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class ErsteListe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErsteListe frame = new ErsteListe();
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
	public ErsteListe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("Erstellen wir deine");
		Heading.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Heading.setBounds(10, 45, 250, 38);
		contentPane.add(Heading);
		
		JLabel lblErsteListe = new JLabel("erste Liste...");
		lblErsteListe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblErsteListe.setBounds(10, 80, 250, 38);
		contentPane.add(lblErsteListe);
		
		JButton meineListeButton = new JButton("Eine Liste für mich erstellen");
		meineListeButton.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\meIcon.jpg"));
		meineListeButton.setBackground(new Color(255, 255, 255));
		meineListeButton.setBounds(10, 158, 250, 93);
		contentPane.add(meineListeButton);
		
		JButton familienListeButton = new JButton("Eine kollaborative Liste erstellen");
		familienListeButton.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\collaborativeIcon.jpg"));
		familienListeButton.setBackground(new Color(255, 255, 255));
		familienListeButton.setBounds(10, 295, 250, 93);
		contentPane.add(familienListeButton);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(176, 196, 222));
		separator.setBounds(0, 125, 285, 8);
		contentPane.add(separator);
	}

}
