package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class MitgliederEinladen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MitgliederEinladen frame = new MitgliederEinladen();
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
	public MitgliederEinladen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Mitglieder einladen");
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 25));
		heading.setBounds(10, 45, 250, 57);
		contentPane.add(heading);
		
		JButton backButton = new JButton("<-");
		backButton.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\backIcon.png"));
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setBackground(new Color(176, 196, 222));
		backButton.setBounds(10, 11, 56, 23);
		contentPane.add(backButton);
		
		JTextPane text = new JTextPane();
		text.setBackground(new Color(230, 230, 250));
		text.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text.setText("Kopiere den Link und sende\r\nihn über eine App deiner\r\nWahl (z.B. WhatsApp oder\r\nEmail) an deine Mitglieder.\r\n\r\n\r\nSobald sie sich die App\r\nheruntergeladenhaben,\r\nsind die Mitglieder Teil\r\ndeiner Gruppe");
		text.setBounds(10, 170, 250, 249);
		contentPane.add(text);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(176, 196, 222));
		separator.setBounds(0, 125, 285, 8);
		contentPane.add(separator);
	}
}
