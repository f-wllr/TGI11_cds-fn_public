import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WortFarbeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WortFarbeGUI frame = new WortFarbeGUI();
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
	public WortFarbeGUI() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb0 = new JLabel("Sag die Farbe, nicht das Wort!");
		lb0.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb0.setBounds(94, 31, 230, 19);
		contentPane.add(lb0);
		
		JLabel lb1 = new JLabel("Gelb");
		lb1.setBounds(38, 73, 46, 14);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Blau");
		lb2.setBounds(128, 73, 46, 14);
		contentPane.add(lb2);
		
		JLabel lb3 = new JLabel("Violett");
		lb3.setBounds(229, 73, 46, 14);
		contentPane.add(lb3);
		
		JLabel lb4 = new JLabel("Gr\u00FCn");
		lb4.setBounds(327, 73, 46, 14);
		contentPane.add(lb4);
		
		JLabel lb5 = new JLabel("Schwarz");
		lb5.setBounds(38, 130, 46, 14);
		contentPane.add(lb5);
		
		JLabel lb6 = new JLabel("Orange");
		lb6.setBounds(128, 130, 46, 14);
		contentPane.add(lb6);
		
		JLabel lb7 = new JLabel("Gelb");
		lb7.setBounds(229, 130, 46, 14);
		contentPane.add(lb7);
		
		JLabel lb8 = new JLabel("Orange");
		lb8.setBounds(327, 130, 46, 14);
		contentPane.add(lb8);
		
		JLabel lb9 = new JLabel("Ben\u00F6tigte Zeit in Sekunden: 0");
		lb9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb9.setBounds(94, 236, 224, 14);
		contentPane.add(lb9);
		
		//long startZeit;
		//long stopZeit;
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WortFarbe neu = new WortFarbe();
				int farbeLabel1 = neu.getFarbe();
				
				switch(farbeLabel1) {
				case 0:
					lb1.setForeground(Color.RED);
					break;
				case 1:
					lb1.setForeground(Color.GREEN);
					break;
				case 2:
					lb1.setForeground(Color.BLUE);
					break;
				case 3:
					lb1.setForeground(Color.YELLOW);
					break;
				case 4:
					lb1.setForeground(Color.ORANGE);
					break;
					
				default:
					lb1.setForeground(Color.BLACK);
					break;
				}
				
				int farbeLabel2 = neu.getFarbe();
				
				switch(farbeLabel2) {
				case 0:
					lb2.setForeground(Color.RED);
					break;
				case 1:
					lb2.setForeground(Color.GREEN);
					break;
				case 2:
					lb2.setForeground(Color.BLUE);
					break;
				case 3:
					lb2.setForeground(Color.YELLOW);
					break;
				case 4:
					lb2.setForeground(Color.ORANGE);
					break;
					
				default:
					lb2.setForeground(Color.BLACK);
					break;
				}
				
				int farbeLabel3 = neu.getFarbe();
				
				switch(farbeLabel3) {
				case 0:
					lb3.setForeground(Color.RED);
					break;
				case 1:
					lb3.setForeground(Color.GREEN);
					break;
				case 2:
					lb3.setForeground(Color.BLUE);
					break;
				case 3:
					lb3.setForeground(Color.YELLOW);
					break;
				case 4:
					lb3.setForeground(Color.ORANGE);
					break;
					
				default:
					lb3.setForeground(Color.BLACK);
					break;
				}
				
				int farbeLabel4 = neu.getFarbe();
				
				switch(farbeLabel4) {
				case 0:
					lb4.setForeground(Color.RED);
					break;
				case 1:
					lb4.setForeground(Color.GREEN);
					break;
				case 2:
					lb4.setForeground(Color.BLUE);
					break;
				case 3:
					lb4.setForeground(Color.YELLOW);
					break;
				case 4:
					lb4.setForeground(Color.ORANGE);
					break;
					
				default:
					lb4.setForeground(Color.BLACK);
					break;
				}
				
				int farbeLabel5 = neu.getFarbe();
				
				switch(farbeLabel5) {
				case 0:
					lb5.setForeground(Color.RED);
					break;
				case 1:
					lb5.setForeground(Color.GREEN);
					break;
				case 2:
					lb5.setForeground(Color.BLUE);
					break;
				case 3:
					lb5.setForeground(Color.YELLOW);
					break;
				case 4:
					lb5.setForeground(Color.ORANGE);
					break;
					
				default:
					lb5.setForeground(Color.BLACK);
					break;
				}
				
				int farbeLabel6 = neu.getFarbe();
				
				switch(farbeLabel6) {
				case 0:
					lb6.setForeground(Color.RED);
					break;
				case 1:
					lb6.setForeground(Color.GREEN);
					break;
				case 2:
					lb6.setForeground(Color.BLUE);
					break;
				case 3:
					lb6.setForeground(Color.YELLOW);
					break;
				case 4:
					lb6.setForeground(Color.ORANGE);
					break;
					
				default:
					lb6.setForeground(Color.BLACK);
					break;
				}
				
				int farbeLabel7 = neu.getFarbe();
				
				switch(farbeLabel7) {
				case 0:
					lb7.setForeground(Color.RED);
					break;
				case 1:
					lb7.setForeground(Color.GREEN);
					break;
				case 2:
					lb7.setForeground(Color.BLUE);
					break;
				case 3:
					lb7.setForeground(Color.YELLOW);
					break;
				case 4:
					lb7.setForeground(Color.ORANGE);
					break;
					
				default:
					lb7.setForeground(Color.BLACK);
					break;
				}
				
				int farbeLabel8 = neu.getFarbe();
				
				switch(farbeLabel8) {
				case 0:
					lb8.setForeground(Color.RED);
					break;
				case 1:
					lb8.setForeground(Color.GREEN);
					break;
				case 2:
					lb8.setForeground(Color.BLUE);
					break;
				case 3:
					lb8.setForeground(Color.YELLOW);
					break;
				case 4:
					lb8.setForeground(Color.ORANGE);
					break;
					
				default:
					lb8.setForeground(Color.BLACK);
					break;
				}
				
				long startZeit = System.currentTimeMillis();
				
				
			}
		});
		btnNewButton.setBounds(85, 190, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stop");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WortFarbe dieEndZeit = new WortFarbe();
				dieEndZeit.setEndTime();
				
				lb9.setText("Benötigte Zeit in Sekunden: " + dieEndZeit.getDuration());
				
			}
		});
		btnNewButton_1.setBounds(229, 190, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
