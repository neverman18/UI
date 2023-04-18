package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GruppenUebersicht extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GruppenUebersicht frame = new GruppenUebersicht();
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
	public GruppenUebersicht() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton profileButton = new JButton("Icon Placeholder");
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		profileButton.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\meIcon.jpg"));
		profileButton.setForeground(new Color(230, 230, 250));
		profileButton.setBackground(new Color(0, 0, 0));
		profileButton.setBounds(195, 11, 65, 57);
		contentPane.add(profileButton);
		
		JLabel lblNewLabel = new JLabel("Gruppen");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 45, 250, 35);
		contentPane.add(lblNewLabel);
		
		searchField = new JTextField();
		searchField.setText("Lupe Suche...");
		searchField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		searchField.setBounds(10, 89, 237, 35);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		JButton privatenListenButton = new JButton("Deine Privaten Listen");
		privatenListenButton.setBackground(new Color(176, 196, 222));
		privatenListenButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		privatenListenButton.setBounds(10, 135, 237, 35);
		contentPane.add(privatenListenButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(253, 208, 17, 290);
		contentPane.add(scrollBar);
		
		JButton gruppenListeFamButton = new JButton("Familie Raab (pin icon)");
		gruppenListeFamButton.setBackground(new Color(255, 255, 255));
		gruppenListeFamButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gruppenListeFamButton.setBounds(10, 208, 237, 35);
		contentPane.add(gruppenListeFamButton);
		
		JButton gruppenListeWgButton = new JButton("WG MA");
		gruppenListeWgButton.setBackground(new Color(255, 255, 255));
		gruppenListeWgButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gruppenListeWgButton.setBounds(10, 254, 237, 35);
		contentPane.add(gruppenListeWgButton);
		
		JButton gruppenListeVrnButton = new JButton("Sportverein TUS");
		gruppenListeVrnButton.setBackground(new Color(255, 255, 255));
		gruppenListeVrnButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gruppenListeVrnButton.setBounds(10, 300, 237, 35);
		contentPane.add(gruppenListeVrnButton);
		
		JButton neueGruppeButton = new JButton("+ Neue Gruppe");
		neueGruppeButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		neueGruppeButton.setBackground(Color.WHITE);
		neueGruppeButton.setBounds(10, 505, 237, 35);
		contentPane.add(neueGruppeButton);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(176, 196, 222));
		separator.setBounds(0, 82, 285, 8);
		contentPane.add(separator);
	}
}
