import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

public class ReaktionGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEins;
	private JButton btnZwei;
	private JButton btnDrei;
	private JButton btnVier;
	private JButton btnFuenf;
	private JButton btnStart;
	private JTextField tfZahl;
	private JTextField tfStatus;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReaktionGUI frame = new ReaktionGUI();
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
	public ReaktionGUI() {
		// TODO Schritt 2b: ListenerObjekt erzeugen und Referenz setzen 1
		MeinListener derListener = new MeinListener();
		derListener.setzeGUIReferenz(this);
		// Das Setzen des ActionListeners bitte unten bei den einzelnen Buttons vornehmen 1
		
		setTitle("Reaktionsspiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEins = new JButton("1");
		// TODO Schritt 2b 1
		btnEins.addActionListener(derListener);
		btnEins.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEins.setEnabled(false);
		btnEins.setBounds(80, 213, 49, 49);
		contentPane.add(btnEins);
		
		btnZwei = new JButton("2");
		// TODO Schritt 2b 1
		btnZwei.addActionListener(derListener);
		btnZwei.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnZwei.setEnabled(false);
		btnZwei.setBounds(180, 213, 49, 49);
		contentPane.add(btnZwei);
		
		btnDrei = new JButton("3");
		// TODO Schritt 2b 1
		btnDrei.addActionListener(derListener);
		btnDrei.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDrei.setEnabled(false);
		btnDrei.setBounds(280, 213, 49, 49);
		contentPane.add(btnDrei);
		
		btnVier = new JButton("4");
		// TODO Schritt 2b 1
		btnVier.addActionListener(derListener);
		btnVier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVier.setEnabled(false);
		btnVier.setBounds(380, 213, 49, 49);
		contentPane.add(btnVier);
		
		btnFuenf = new JButton("5");
		// TODO Schritt 2b 1
		btnFuenf.addActionListener(derListener);
		btnFuenf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFuenf.setEnabled(false);
		btnFuenf.setBounds(480, 213, 49, 49);
		contentPane.add(btnFuenf);
		
		btnStart = new JButton("Start");
		// TODO Schritt 2b 1
		btnStart.addActionListener(derListener);
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStart.setBounds(180, 309, 249, 54);
		contentPane.add(btnStart);
		
		tfZahl = new JTextField();
		tfZahl.setFont(new Font("Tahoma", Font.PLAIN, 36));
		tfZahl.setBounds(264, 63, 87, 87);
		contentPane.add(tfZahl);
		tfZahl.setColumns(10);
		
		tfStatus = new JTextField();
		tfStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfStatus.setBounds(80, 395, 449, 38);
		contentPane.add(tfStatus);
		tfStatus.setColumns(10);
		
		
	}
	
	public void setzeButtons(boolean laeuft) {
		if (laeuft == true) {
			btnEins.setEnabled(true);
			btnZwei.setEnabled(true);
			btnDrei.setEnabled(true);
			btnVier.setEnabled(true);
			btnFuenf.setEnabled(true);
			btnStart.setEnabled(false);
		} else {
			btnEins.setEnabled(false);
			btnZwei.setEnabled(false);
			btnDrei.setEnabled(false);
			btnVier.setEnabled(false);
			btnFuenf.setEnabled(false);
			btnStart.setEnabled(true);
		}
	}

	public void zeigeZahl(int z) {
		tfZahl.setText(Integer.toString(z));
	}

	public void zeigeStatus(String pStatus) {
		tfStatus.setText(pStatus);		
	}
}
