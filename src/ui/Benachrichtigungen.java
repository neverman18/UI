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

public class Benachrichtigungen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Benachrichtigungen frame = new Benachrichtigungen();
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
	public Benachrichtigungen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBenachrichtigungen = new JLabel("Benachrichtigungen");
		lblBenachrichtigungen.setHorizontalAlignment(SwingConstants.CENTER);
		lblBenachrichtigungen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBenachrichtigungen.setBounds(10, 41, 250, 45);
		contentPane.add(lblBenachrichtigungen);
		
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
		
		JLabel listen = new JLabel("Listen");
		listen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listen.setBounds(10, 161, 154, 34);
		contentPane.add(listen);
		
		JLabel gruppen = new JLabel("Gruppen");
		gruppen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gruppen.setBounds(10, 224, 154, 34);
		contentPane.add(gruppen);
		
		JRadioButton listen_on = new JRadioButton("on");
		listen_on.setBackground(new Color(230, 230, 250));
		listen_on.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listen_on.setBounds(153, 170, 56, 23);
		contentPane.add(listen_on);
		
		JRadioButton listen_off = new JRadioButton("off");
		listen_off.setBackground(new Color(230, 230, 250));
		listen_off.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listen_off.setBounds(211, 170, 56, 23);
		contentPane.add(listen_off);
		
		JRadioButton gruppen_on = new JRadioButton("on");
		gruppen_on.setBackground(new Color(230, 230, 250));
		gruppen_on.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gruppen_on.setBounds(153, 224, 56, 23);
		contentPane.add(gruppen_on);
		
		JRadioButton gruppen_off = new JRadioButton("off");
		gruppen_off.setBackground(new Color(230, 230, 250));
		gruppen_off.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gruppen_off.setBounds(211, 224, 56, 23);
		contentPane.add(gruppen_off);
	}
}
