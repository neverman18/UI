package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Startpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startpage frame = new Startpage();
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
	public Startpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel willkommen = new JLabel("Willkommen");
		willkommen.setHorizontalAlignment(SwingConstants.CENTER);
		willkommen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		willkommen.setBounds(10, 106, 250, 31);
		contentPane.add(willkommen);
		
		JLabel lblBei = new JLabel("bei");
		lblBei.setHorizontalAlignment(SwingConstants.CENTER);
		lblBei.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBei.setBounds(10, 151, 250, 31);
		contentPane.add(lblBei);
		
		JLabel lblShopgether = new JLabel("Shop2gether");
		lblShopgether.setHorizontalAlignment(SwingConstants.CENTER);
		lblShopgether.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblShopgether.setBounds(10, 195, 250, 31);
		contentPane.add(lblShopgether);
		ImageIcon imageIcon = new ImageIcon("app_icon.jpg");
		
		JLabel lblDeineKollaborative = new JLabel("Deine kollaborative");
		lblDeineKollaborative.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeineKollaborative.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDeineKollaborative.setBounds(10, 336, 250, 31);
		contentPane.add(lblDeineKollaborative);
		
		JLabel lblEinkaufsapp = new JLabel("Einkaufsapp");
		lblEinkaufsapp.setHorizontalAlignment(SwingConstants.CENTER);
		lblEinkaufsapp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEinkaufsapp.setBounds(10, 373, 250, 31);
		contentPane.add(lblEinkaufsapp);
		
		JLabel AppIcon = new JLabel("");
		AppIcon.setHorizontalAlignment(SwingConstants.CENTER);
		AppIcon.setIcon(new ImageIcon("C:\\Users\\CHolzamer\\OneDrive\\DHBW\\Konzeption von UIs\\Images\\AppIcon.jpg"));
		AppIcon.setBounds(20, 237, 224, 92);
		contentPane.add(AppIcon);
		
	}

}
