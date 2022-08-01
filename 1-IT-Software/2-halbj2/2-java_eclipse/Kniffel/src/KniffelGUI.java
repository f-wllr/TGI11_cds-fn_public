import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.border.LineBorder;

public class KniffelGUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4658824718056604L;
	private JPanel contentPane;
	private JTextField [][] textFields = new JTextField[2][13];
	private JButton [][] buttons = new JButton[2][13];
	
	private int [] augen = {1, 2, 3, 5, 6};
	private boolean [] behalten = new boolean[5];
	private JLabel [] wurfel = new JLabel[5];
	private JCheckBox [] behCB = new JCheckBox[5];
	
	private ImageIcon [] wbilder = new ImageIcon[6];
	
	private JTextField txtSpielerBitte;
	private JButton btnWurfeln;
	private JPanel panel_wurf;
	private JPanel panel;

	private int dran = 1;
	private int anzWurfe = 0;
	private JTextField [] tfPunkte = new JTextField[2];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KniffelGUI frame = new KniffelGUI();
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
	public KniffelGUI() {
		setTitle("Kniffel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0};
		gbl_panel.rowHeights = new int[]{0};
		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtSpielerBitte = new JTextField();
		txtSpielerBitte.setText("Spieler 1 bitte w\u00FCrfeln");
		contentPane.add(txtSpielerBitte, BorderLayout.SOUTH);
		txtSpielerBitte.setColumns(10);
		
		btnWurfeln = new JButton("W\u00FCrfeln");
		btnWurfeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wurfeln();
			}
		});
		btnWurfeln.setForeground(Color.WHITE);
		btnWurfeln.setBackground(Color.BLUE);
		btnWurfeln.setFont(new Font("Tahoma", Font.BOLD, 36));
		contentPane.add(btnWurfeln, BorderLayout.NORTH);
		
		panel_wurf = new JPanel();
		panel_wurf.setBorder(new LineBorder(Color.BLUE, 6, true));
		contentPane.add(panel_wurf, BorderLayout.WEST);
		panel_wurf.setLayout(new GridLayout(0, 4, 0, 0));
		
		// Würfelbilder laden
		for (int i=0; i<6; i++) {
			String bildname = "w"+Integer.toString(i+1)+".png";
			BufferedImage w;
			try {
				w = ImageIO.read(getClass().getResource(bildname));
				wbilder[i] = new ImageIcon(w);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Fehler beim Einlesen von " + bildname);
				e1.printStackTrace();
			}			
		}
		
		// Würfelicons und Checkboxen erzeugen und anzeigen
		for (int i=0; i<5; i++) {
			panel_wurf.add(new JLabel("   "));
			wurfel[i] = new JLabel();
			wurfel[i].setIcon(wbilder[augen[i]-1]);
			panel_wurf.add(wurfel[i]);
			behCB[i] = new JCheckBox();
			behCB[i].setEnabled(false);
			panel_wurf.add(behCB[i]);
			panel_wurf.add(new JLabel("  "));
		}
		
		GridBagConstraints gbc = new GridBagConstraints();
		String [] texte = {"1er", "2er", "3er", "4er", "5er", "6er", "Dreierpasch", "Viererpasch", "Full House", "Kleine Straße", "Große Straße", "Kniffel", "Chance"};
		for (int i=0; i<13; i++) {
			// Eintragsfelder anlegen und anzeigen
			gbc.gridwidth = 2;
			gbc.gridx = 0;
			gbc.gridy = i;
			gbc.ipadx = 0;
			gbc.weightx = 1./6;
			gbc.weighty = 1./14;
			JLabel lblNewLabel = new JLabel(texte[i]);
			panel.add(lblNewLabel, gbc);
			
			gbc.gridwidth = 1;
			gbc.gridx = 2;
			gbc.gridy = i;
			gbc.ipadx = 0;
			buttons[0][i] = new JButton("-->");
			buttons[0][i].setActionCommand("0"+Integer.toHexString(i));
			buttons[0][i].addActionListener(this);
			buttons[0][i].setEnabled(false);
			panel.add(buttons[0][i], gbc);
			
			gbc.gridwidth = 1;
			gbc.gridx = 3;
			gbc.gridy = i;
			gbc.ipadx = 40;
			textFields[0][i] = new JTextField();
			textFields[0][i].setEditable(false);
			panel.add(textFields[0][i], gbc);
			
			gbc.gridwidth = 1;
			gbc.gridx = 4;
			gbc.gridy = i;
			gbc.ipadx = 0;
			buttons[1][i] = new JButton("-->");
			buttons[1][i].setActionCommand("1"+Integer.toHexString(i));
			buttons[1][i].addActionListener(this);
			buttons[1][i].setEnabled(false);
			panel.add(buttons[1][i], gbc);
			
			gbc.gridwidth = 1;
			gbc.gridx = 5;
			gbc.gridy = i;
			gbc.ipadx = 40;
			textFields[1][i] = new JTextField();
			textFields[1][i].setEditable(false);
			panel.add(textFields[1][i], gbc);
		}
		
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 13;
		gbc.ipadx = 0;
		gbc.weightx = 1./6;
		gbc.weighty = 1./14;
		JLabel lblNewLabel = new JLabel("Gesamtpunkte");
		panel.add(lblNewLabel, gbc);
		
		gbc.gridwidth = 1;
		gbc.gridx = 3;
		gbc.gridy = 13;
		gbc.ipadx = 40;
		tfPunkte[0] = new JTextField();
		tfPunkte[0].setEditable(false);
		panel.add(tfPunkte[0], gbc);
		
		gbc.gridwidth = 1;
		gbc.gridx = 5;
		gbc.gridy = 13;
		gbc.ipadx = 40;
		tfPunkte[1] = new JTextField();
		tfPunkte[1].setEditable(false);
		panel.add(tfPunkte[1], gbc);
		
	}

	protected void wurfeln() {
		for (int i=0; i<5; i++) {
			behalten[i] = behCB[i].isSelected();
			behCB[i].setEnabled(true);
		}
		KniffelControl.wuerfelnAlle(augen, behalten);
		for (int i=0; i<5; i++) {
			wurfel[i].setIcon(wbilder[augen[i]-1]);
		}
		
		
		if (dran == 1) {
			for (JButton b : buttons[0]) {
				if (b != null)
					b.setEnabled(true);
			}
			for (JButton b : buttons[1]) {
				if (b != null)
					b.setEnabled(false);
			}
		} else {
			for (JButton b : buttons[0]) {
				if (b != null)
					b.setEnabled(false);
			}
			for (JButton b : buttons[1]) {
				if (b != null)
					b.setEnabled(true);
			}
		}
		anzWurfe++;
		if (anzWurfe == 3) {
			btnWurfeln.setEnabled(false);
			txtSpielerBitte.setText("Bitte eintragen");
		}
		
		
		this.repaint();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int spieler = Integer.parseInt(e.getActionCommand().substring(0, 1));
		int option = Integer.parseInt(e.getActionCommand().substring(1), 16);
		int punkte = 0; 
		switch(option) {
			case 0: punkte = KniffelControl.berechne1er(augen); break;
			case 1: punkte = KniffelControl.berechne2er(augen); break;
			case 2: punkte = KniffelControl.berechne3er(augen); break;
			case 3: punkte = KniffelControl.berechne4er(augen); break;
			case 4: punkte = KniffelControl.berechne5er(augen); break;
			case 5: punkte = KniffelControl.berechne6er(augen); break;
			case 6: punkte = KniffelControl.berechneDreierpasch(augen); break;
			case 7: punkte = KniffelControl.berechneViererpasch(augen); break;
			case 8: punkte = KniffelControl.berechneFullHouse(augen); break;
			case 9: punkte = KniffelControl.berechneKlStrasse(augen); break;
			case 10: punkte = KniffelControl.berechneGrStrasse(augen); break;
			case 11: punkte = KniffelControl.berechneKniffel(augen); break;
			default: punkte = KniffelControl.berechneChance(augen); break;
		}
		textFields[spieler][option].setText(Integer.toString(punkte));
		tfPunkte[spieler].setText(Integer.toString(KniffelControl.berechneGesamtpunkte(spieler, punkte)));
		panel.remove(buttons[spieler][option]);
		buttons[spieler][option] = null;
		panel.repaint();
		dran = 3-dran;
		
		for (JButton b : buttons[0]) {
			if (b != null)
				b.setEnabled(false);
		}
		for (JButton b : buttons[1]) {
			if (b != null)
				b.setEnabled(false);
		}
		for (JCheckBox c : behCB) {
			c.setSelected(false);
			c.setEnabled(false);
		}
		btnWurfeln.setEnabled(true);
		anzWurfe = 0;
		txtSpielerBitte.setText("Spieler " + dran + " bitte w\u00FCrfeln");
	}

}
