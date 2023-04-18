package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Vorteile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vorteile frame = new Vorteile();
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
	public Vorteile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Shop2gether kann...");
		heading.setFont(new Font("Tahoma", Font.PLAIN, 25));
		heading.setBounds(10, 45, 250, 45);
		contentPane.add(heading);
		
		JTextPane txtpnGruppenErstellen = new JTextPane();
		txtpnGruppenErstellen.setEditable(false);
		txtpnGruppenErstellen.setBackground(new Color(230, 230, 250));
		txtpnGruppenErstellen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnGruppenErstellen.setText("- Gruppen erstellen, in\r\n   denen mehrere\r\n   Einkaufslisten enthalten\r\n   sind\r\n\r\n- Gruppen mit Freunden\r\n   und Familie teilen\r\n\r\n- Eine Private Gruppe nur \r\n   für deine Einkaufsliste\r\n\r\n- Deine Einkäufe\r\n   organisieren");
		txtpnGruppenErstellen.setBounds(10, 151, 250, 358);
		contentPane.add(txtpnGruppenErstellen);
		
		JButton startButton = new JButton("Start ->");
		startButton.setBackground(new Color(176, 196, 222));
		startButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		startButton.setBounds(33, 500, 196, 40);
		contentPane.add(startButton);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(176, 196, 222));
		separator.setBounds(0, 125, 285, 8);
		contentPane.add(separator);
	}
}
