package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class AllgEinstellungen extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllgEinstellungen frame = new AllgEinstellungen();
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
	public AllgEinstellungen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel einstellungen = new JLabel("Einstellungen");
		einstellungen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		einstellungen.setBounds(10, 10, 228, 51);
		contentPane.add(einstellungen);
		
		JLabel anzeigeName = new JLabel("Anzeigename");
		anzeigeName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		anzeigeName.setBounds(10, 69, 102, 31);
		contentPane.add(anzeigeName);
		
		txtMaria = new JTextField();
		txtMaria.setText("Maria");
		txtMaria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMaria.setBounds(10, 99, 250, 19);
		contentPane.add(txtMaria);
		txtMaria.setColumns(10);
		
		JLabel dunkelModus = new JLabel("Dunkelmodus");
		dunkelModus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dunkelModus.setBounds(10, 144, 120, 25);
		contentPane.add(dunkelModus);
		
		JRadioButton hell = new JRadioButton("Hell");
		hell.setSelected(true);
		hell.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hell.setBounds(117, 148, 51, 21);
		contentPane.add(hell);
		
		JRadioButton dunkel = new JRadioButton("Dunkel");
		dunkel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dunkel.setBounds(183, 146, 77, 21);
		contentPane.add(dunkel);
		
		JLabel schriftGroesse = new JLabel("Schriftgröße");
		schriftGroesse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		schriftGroesse.setBounds(10, 200, 120, 25);
		contentPane.add(schriftGroesse);
		
		JButton kleineSchrift = new JButton("Aa");
		kleineSchrift.setBackground(Color.WHITE);
		kleineSchrift.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kleineSchrift.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		kleineSchrift.setBounds(10, 240, 90, 30);
		contentPane.add(kleineSchrift);
		
		JButton grosseSchrift = new JButton("Aa");
		grosseSchrift.setBackground(Color.WHITE);
		grosseSchrift.setFont(new Font("Tahoma", Font.PLAIN, 20));
		grosseSchrift.setBounds(133, 240, 90, 30);
		contentPane.add(grosseSchrift);
		
		JLabel sprache = new JLabel("Spracheinstellungen");
		sprache.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sprache.setBounds(10, 290, 158, 25);
		contentPane.add(sprache);
		
		JButton deutsch = new JButton("Deutsch");
		deutsch.setBackground(Color.WHITE);
		deutsch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		deutsch.setBounds(10, 333, 90, 30);
		contentPane.add(deutsch);
		
		JButton english = new JButton("English");
		english.setBackground(Color.WHITE);
		english.setFont(new Font("Tahoma", Font.PLAIN, 15));
		english.setBounds(133, 333, 90, 30);
		contentPane.add(english);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 58, 270, 19);
		contentPane.add(separator);
		
		JButton benachrichtigungen = new JButton("Benachrichtigungen");
		benachrichtigungen.setBackground(Color.WHITE);
		benachrichtigungen.setHorizontalAlignment(SwingConstants.LEFT);
		benachrichtigungen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		benachrichtigungen.setBounds(10, 390, 250, 30);
		contentPane.add(benachrichtigungen);
		
		JButton smartAssistent = new JButton("Smart Assistent");
		smartAssistent.setBackground(Color.WHITE);
		smartAssistent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		smartAssistent.setHorizontalAlignment(SwingConstants.LEFT);
		smartAssistent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		smartAssistent.setBounds(10, 430, 250, 30);
		contentPane.add(smartAssistent);
		
		JButton hilfe = new JButton("Hilfe");
		hilfe.setBackground(Color.WHITE);
		hilfe.setHorizontalAlignment(SwingConstants.LEFT);
		hilfe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hilfe.setBounds(10, 470, 250, 30);
		contentPane.add(hilfe);
		
		JButton accountLoeschen = new JButton("Account löschen");
		accountLoeschen.setBackground(Color.WHITE);
		accountLoeschen.setForeground(Color.RED);
		accountLoeschen.setHorizontalAlignment(SwingConstants.LEFT);
		accountLoeschen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		accountLoeschen.setBounds(10, 510, 250, 30);
		contentPane.add(accountLoeschen);
	}
}
