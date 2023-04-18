package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JSeparator;

public class Mitglieder extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mitglieder frame = new Mitglieder();
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
	public Mitglieder() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Lade deine Mitglieder");
		heading.setBounds(10, 45, 260, 48);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(heading);
		
		JLabel lblEin = new JLabel("ein...");
		lblEin.setBounds(10, 80, 260, 48);
		lblEin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblEin);
		
		JTextArea linkArea = new JTextArea();
		linkArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		linkArea.setText("https://shop2geth\r\ner/...");
		linkArea.setBounds(10, 154, 178, 91);
		contentPane.add(linkArea);
		
		JButton copieButton = new JButton("");
		copieButton.setBackground(new Color(176, 196, 222));
		copieButton.setToolTipText("");
		copieButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		ImageIcon copySymbol = new ImageIcon("copie_symbol2.png");
		copieButton.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\copy_icon1.jpg"));
		
		//copieButton.setMargin(new Insets(10,10,10,10));
		copieButton.setFont(new Font("Tahoma", Font.PLAIN, 6));
		copieButton.setBounds(190, 154, 70, 91);
		contentPane.add(copieButton);
		
		JLabel kopieText = new JLabel("Kopiere den Link und");
		kopieText.setHorizontalAlignment(SwingConstants.CENTER);
		kopieText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kopieText.setBounds(10, 241, 250, 48);
		contentPane.add(kopieText);
		
		JLabel lblSendeIhnAn = new JLabel("sende ihn an deine Mitglieder");
		lblSendeIhnAn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSendeIhnAn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSendeIhnAn.setBounds(10, 277, 250, 48);
		contentPane.add(lblSendeIhnAn);
		
		JButton weiter = new JButton("Weiter");
		weiter.setBackground(new Color(176, 196, 222));
		weiter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		weiter.setBounds(62, 336, 145, 42);
		contentPane.add(weiter);
		
		JButton fragezeichen = new JButton("?");
		fragezeichen.setBackground(new Color(176, 196, 222));
		fragezeichen.setBounds(214, 511, 46, 29);
		contentPane.add(fragezeichen);
		
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
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
