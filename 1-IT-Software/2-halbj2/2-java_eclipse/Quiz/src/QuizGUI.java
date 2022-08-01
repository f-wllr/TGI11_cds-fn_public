import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizGUI extends JFrame {

	private JPanel contentPane;
	private JTextField tfAusgabe;
	private JTextField tfEingabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizGUI frame = new QuizGUI();
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
	public QuizGUI() {
		setTitle("Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrage = new JLabel("Wie heiﬂt die Hauptstadt von Deutschland?");
		lblFrage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrage.setBounds(55, 27, 322, 32);
		contentPane.add(lblFrage);
		
		JButton btnKlick = new JButton("Hier klicken");
		btnKlick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eingabe = tfEingabe.getText();
				if(eingabe.equals("Berlin")) {
					tfAusgabe.setText("Richtig");
				}else {
					tfAusgabe.setText("Falsch");
				}
			}
		});
		btnKlick.setBounds(157, 100, 119, 43);
		contentPane.add(btnKlick);
		
		tfAusgabe = new JTextField();
		tfAusgabe.setEditable(false);
		tfAusgabe.setBounds(157, 178, 119, 43);
		contentPane.add(tfAusgabe);
		tfAusgabe.setColumns(10);
		
		tfEingabe = new JTextField();
		tfEingabe.setBounds(157, 143, 119, 43);
		contentPane.add(tfEingabe);
		tfEingabe.setColumns(10);
	}
}
