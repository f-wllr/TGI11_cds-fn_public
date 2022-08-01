import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class PlanerGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField tfTitel;
	private JTextField tfFach;
	private JTextField tfTag;
	private JTextField tfMonat;
	private JTextArea taBeschreibung;
	Aufgabe [] dieAufgaben = new Aufgabe[20];
	private JCheckBox cbErledigt;
	private JSpinner sprNummer;
	private JButton btnNeuAkt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanerGUI frame = new PlanerGUI();
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
	public PlanerGUI() {
		setTitle("Hausaufgabenplaner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sprNummer = new JSpinner();
		sprNummer.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		sprNummer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sprNummer.setBounds(67, 63, 136, 37);
		contentPane.add(sprNummer);
		
		JButton btnZeigen = new JButton("Zeige Aufgabe");
		btnZeigen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnZeigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int stelle = (Integer)sprNummer.getValue();
				Aufgabe dieAktuelle = dieAufgaben[stelle];
				
				if (dieAktuelle != null){
					tfTitel.setText(dieAktuelle.titel);
					tfFach.setText(dieAktuelle.fach);
					tfTag.setText(Integer.toString(dieAktuelle.tag));
					tfMonat.setText(Integer.toString(dieAktuelle.monat));
					cbErledigt.setSelected(dieAktuelle.erledigt);
					taBeschreibung.setText(dieAktuelle.beschreibung);
					
					btnNeuAkt.setText("Aktualisieren");
				} else {
					tfTitel.setText(" ");
					tfFach.setText(" ");
					tfTag.setText(" ");
					tfMonat.setText(" ");
					cbErledigt.setSelected(false);
					taBeschreibung.setText(" ");

					btnNeuAkt.setText("Neu anlegen");
				}
				
				// Hier muss der Code für den zweiten Schritt - Aufgaben anzeigen - hin
				
			}
		});
		btnZeigen.setBounds(67, 115, 136, 37);
		contentPane.add(btnZeigen);
		JLabel lblNewLabel = new JLabel("Titel: ");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(300, 25, 45, 13);
		contentPane.add(lblNewLabel);
		
		tfTitel = new JTextField();
		tfTitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfTitel.setBounds(416, 25, 267, 29);
		contentPane.add(tfTitel);
		tfTitel.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fach:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(300, 76, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		tfFach = new JTextField();
		tfFach.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfFach.setColumns(10);
		tfFach.setBounds(416, 77, 267, 29);
		contentPane.add(tfFach);
		
		JLabel lblNewLabel_2 = new JLabel("bis:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(300, 128, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		tfTag = new JTextField();
		tfTag.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfTag.setColumns(10);
		tfTag.setBounds(416, 129, 55, 29);
		contentPane.add(tfTag);
		
		tfMonat = new JTextField();
		tfMonat.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfMonat.setBounds(507, 129, 55, 29);
		tfMonat.setColumns(10);
		contentPane.add(tfMonat);
		
		JLabel lblNewLabel_4 = new JLabel(".");
		lblNewLabel_4.setBounds(472, 140, 14, 12);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel(".");
		lblNewLabel_4_1.setBounds(564, 140, 14, 12);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3 = new JLabel("Beschreibung");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(300, 184, 78, 13);
		contentPane.add(lblNewLabel_3);
		
		taBeschreibung = new JTextArea();
		taBeschreibung.setWrapStyleWord(true);
		taBeschreibung.setLineWrap(true);
		taBeschreibung.setBounds(415, 182, 268, 193);
		contentPane.add(taBeschreibung);
		
		cbErledigt = new JCheckBox("erledigt");
		cbErledigt.setFont(new Font("Dialog", Font.PLAIN, 12));
		cbErledigt.setBounds(416, 382, 93, 21);
		contentPane.add(cbErledigt);
		
		
		btnNeuAkt = new JButton("Neu anlegen");
		btnNeuAkt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNeuAkt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Neu anlegen")) {
					Aufgabe neu = new Aufgabe();
					
					neu.titel = tfTitel.getText();		
					neu.fach = tfFach.getText();
					neu.tag = Integer.parseInt(tfTag.getText());
					neu.monat = Integer.parseInt(tfMonat.getText());
					neu.beschreibung = taBeschreibung.getText();
					
					int stelle = (Integer)sprNummer.getValue();
					
					dieAufgaben[stelle] = neu;
					
					// Hier den Code "Neue Aufgabe" aus dem ersten Schritt hin
					
					btnNeuAkt.setText("Aktualisieren");
				} else {

					String was = e.getActionCommand();
					if (was.equals("Neu anlegen")){
						Aufgabe neu = new Aufgabe();
						
						neu.titel = tfTitel.getText();		
						neu.fach = tfFach.getText();
						neu.tag = Integer.parseInt(tfTag.getText());
						neu.monat = Integer.parseInt(tfMonat.getText());
						neu.beschreibung = taBeschreibung.getText();
						
						int stelle = (Integer)sprNummer.getValue();
						
						dieAufgaben[stelle] = neu;
					  // alter Code für neue Aufgaben
					} else {
						
					  // neuer Code für Aktualisierung
					}
					int anzeige = (Integer)sprNummer.getValue();
					Aufgabe akt = dieAufgaben[anzeige];
					
					akt.titel = tfTitel.getText();		
					akt.fach = tfFach.getText();
					akt.tag = Integer.parseInt(tfTag.getText());
					akt.monat = Integer.parseInt(tfMonat.getText());
					akt.beschreibung = taBeschreibung.getText();
					akt.erledigt = cbErledigt.isSelected();
					// Hier im dritten Schritt den Code zu "Aktualisieren" hin
					
				}
			}
		});
		btnNeuAkt.setBounds(335, 435, 136, 29);
		contentPane.add(btnNeuAkt);
		
		JButton btnLöschen = new JButton("Aufgabe l\u00F6schen");
		btnLöschen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLöschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int stelle = (Integer)sprNummer.getValue();
				dieAufgaben[stelle] = null;		
			}
		});
		btnLöschen.setBounds(553, 435, 130, 29);
		contentPane.add(btnLöschen);		
		
	}
}
