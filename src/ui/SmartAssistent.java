package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

public class SmartAssistent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartAssistent frame = new SmartAssistent();
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
	public SmartAssistent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSmartAssistent = new JLabel("Smart Assistent");
		lblSmartAssistent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmartAssistent.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSmartAssistent.setBounds(10, 45, 250, 45);
		contentPane.add(lblSmartAssistent);
		
		JButton backButton1 = new JButton("<-");
		backButton1.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\backIcon.png"));
		backButton1.setForeground(Color.BLACK);
		backButton1.setBackground(new Color(176, 196, 222));
		backButton1.setBounds(10, 11, 56, 23);
		contentPane.add(backButton1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(176, 196, 222));
		separator.setBounds(0, 125, 285, 8);
		contentPane.add(separator);
		
		JLabel zugangErlauben = new JLabel("Zugang erlauben");
		zugangErlauben.setFont(new Font("Tahoma", Font.PLAIN, 18));
		zugangErlauben.setBounds(10, 156, 154, 34);
		contentPane.add(zugangErlauben);
		
		JLabel artikelHinzufügen = new JLabel("Artikel hinzufügen");
		artikelHinzufügen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		artikelHinzufügen.setBounds(10, 214, 154, 34);
		contentPane.add(artikelHinzufügen);
		
		JLabel artikelDelete = new JLabel("Artikel löschen");
		artikelDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		artikelDelete.setBounds(10, 274, 154, 34);
		contentPane.add(artikelDelete);
		
		JLabel listenErstellen = new JLabel("Listen erstellen");
		listenErstellen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listenErstellen.setBounds(10, 334, 154, 34);
		contentPane.add(listenErstellen);
		
		JLabel listenDelete = new JLabel("Listen löschen");
		listenDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listenDelete.setBounds(10, 393, 154, 34);
		contentPane.add(listenDelete);
		
		JRadioButton listen_on = new JRadioButton("on");
		listen_on.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listen_on.setBounds(156, 162, 56, 23);
		contentPane.add(listen_on);
		
		JRadioButton listen_on_1 = new JRadioButton("on");
		listen_on_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listen_on_1.setBounds(214, 162, 56, 23);
		contentPane.add(listen_on_1);
	}

}
