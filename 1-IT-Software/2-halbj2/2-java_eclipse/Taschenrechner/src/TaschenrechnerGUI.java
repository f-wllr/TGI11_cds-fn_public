import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class TaschenrechnerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField tfZahl1;
	private JTextField tfZahl2;
	private JTextField tfErgebnis;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaschenrechnerGUI frame = new TaschenrechnerGUI();
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
	public TaschenrechnerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rbPlus = new JRadioButton("+");
		buttonGroup.add(rbPlus);
		rbPlus.setSelected(true);
		rbPlus.setBounds(190, 7, 40, 23);
		contentPane.add(rbPlus);
		
		JRadioButton rbMinus = new JRadioButton("-");
		buttonGroup.add(rbMinus);
		rbMinus.setBounds(190, 35, 40, 23);
		contentPane.add(rbMinus);
		
		JRadioButton rbMal = new JRadioButton("*");
		buttonGroup.add(rbMal);
		rbMal.setBounds(190, 61, 40, 23);
		contentPane.add(rbMal);
		
		JRadioButton rbDurch = new JRadioButton("/");
		buttonGroup.add(rbDurch);
		rbDurch.setBounds(190, 87, 40, 23);
		contentPane.add(rbDurch);
		
		JRadioButton rbProzentwert = new JRadioButton("%");
		buttonGroup.add(rbProzentwert);
		rbProzentwert.setBounds(190, 113, 40, 23);
		contentPane.add(rbProzentwert);
		
		JRadioButton rbQuadrieren = new JRadioButton("^2");
		rbQuadrieren.setBounds(190, 139, 40, 23);
		contentPane.add(rbQuadrieren);
		
		tfZahl1 = new JTextField();
		tfZahl1.setBounds(10, 101, 86, 20);
		contentPane.add(tfZahl1);
		tfZahl1.setColumns(10);
		
		tfZahl2 = new JTextField();
		tfZahl2.setBounds(338, 101, 86, 20);
		contentPane.add(tfZahl2);
		tfZahl2.setColumns(10);
		
		tfErgebnis = new JTextField();
		tfErgebnis.setEditable(false);
		tfErgebnis.setBounds(190, 230, 234, 20);
		contentPane.add(tfErgebnis);
		tfErgebnis.setColumns(10);
		
		JButton btnRechnen = new JButton("Berechnen");
		btnRechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(rbPlus.isSelected()) {
					tfErgebnis.setText(Integer.toString(Integer.parseInt(tfZahl1.getText()) + Integer.parseInt(tfZahl2.getText())));
				}else if(rbMinus.isSelected()) {
					tfErgebnis.setText(Integer.toString(Integer.parseInt(tfZahl1.getText()) - Integer.parseInt(tfZahl2.getText())));
				}else if(rbMal.isSelected()) {
					tfErgebnis.setText(Integer.toString(Integer.parseInt(tfZahl1.getText()) * Integer.parseInt(tfZahl2.getText())));
				}else if(rbDurch.isSelected()) {
					if(Integer.parseInt(tfZahl1.getText()) == 0) {
						tfErgebnis.setText("Fehler");
					}else {
						tfErgebnis.setText(Integer.toString(Integer.parseInt(tfZahl1.getText()) / Integer.parseInt(tfZahl2.getText())) + " R " + Integer.toString(Integer.parseInt(tfZahl1.getText()) % Integer.parseInt(tfZahl2.getText())));
					}
				}else if(rbProzentwert.isSelected()) {
					tfErgebnis.setText(Double.toString(Double.parseDouble(tfZahl1.getText()) * (Double.parseDouble(tfZahl2.getText()) / 100)));
				}
			}
		});
		btnRechnen.setBounds(44, 229, 89, 23);
		contentPane.add(btnRechnen);
	}
}
