
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gui extends JFrame {

	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: Gui
	 * Lines: 326
	 * Description: UI and Events handling for the main frame.
	 * 
	 * 
	 */

	private static final long serialVersionUID = 1L;

	// Buttons

	public final JButton calcolo = new JButton();
	public final JButton copytoclipboard = new JButton();
	public final JButton aboutb = new JButton();
	public final JButton githubb = new JButton();
	public final JButton bugb = new JButton();

	// Textfields

	public final JTextField field1 = new JTextField();
	public final JTextField field2 = new JTextField();
	public final JTextField field5 = new JTextField();
	public final JTextField field7 = new JTextField();

	// Comboboxes

	String[] giorni = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "24", "29", "30", "31" };
	public final JComboBox<String> field3 = new JComboBox<String>(giorni);

	String[] mesi = { "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre",
			"Ottobre", "Novembre", "Dicembre" };
	public final JComboBox<String> field4 = new JComboBox<String>(mesi);

	String[] sex1 = { "M", "F" };
	public final JComboBox<String> field6 = new JComboBox<String>(sex1);

	// Images and ImageIcons

	Image logo = new ImageIcon(getClass().getClassLoader().getResource("logo.png")).getImage();
	ImageIcon copy = new ImageIcon(getClass().getClassLoader().getResource("copy.png"));
	ImageIcon hovercopy = new ImageIcon(getClass().getClassLoader().getResource("hovercopy.png"));
	ImageIcon about = new ImageIcon(getClass().getClassLoader().getResource("about.png"));
	ImageIcon hoverabout = new ImageIcon(getClass().getClassLoader().getResource("hoverabout.png"));
	ImageIcon github = new ImageIcon(getClass().getClassLoader().getResource("github.png"));
	ImageIcon hovergithub = new ImageIcon(getClass().getClassLoader().getResource("hovergithub.png"));
	ImageIcon bug = new ImageIcon(getClass().getClassLoader().getResource("bug.png"));
	ImageIcon hoverbug = new ImageIcon(getClass().getClassLoader().getResource("hoverbug.png"));
	ImageIcon calc = new ImageIcon(getClass().getClassLoader().getResource("calc.png"));
	ImageIcon hovercalc = new ImageIcon(getClass().getClassLoader().getResource("hovercalc.png"));

	// Labels

	public final JLabel surnamel = new JLabel("Cognome:");
	public final JLabel namel = new JLabel("Nome:");
	public final JLabel birthdayl = new JLabel("Giorno di nascita:");
	public final JLabel birthmonthl = new JLabel("Mese di nascita:");
	public final JLabel birthyearl = new JLabel("Anno di nascita:");
	public final JLabel sexl = new JLabel("Sesso:");
	public final JLabel comunel = new JLabel("Comune di nascita:");
	public final JLabel result = new JLabel("___________________");
	public final JLabel phrase = new JLabel("Il tuo codice fiscale è:");
	public final JLabel title1 = new JLabel("CALCOLATORE");
	public final JLabel title2 = new JLabel("DEL");
	public final JLabel title3 = new JLabel("CODICE FISCALE");
	public final JLabel nb = new JLabel("Nota bene:");
	public final JLabel info = new JLabel("                      Il programma ricava un codice fiscale valido per");
	public final JLabel info1 = new JLabel("quasi la totalità dei casi. Non gestisce i casi di omocodia, cioè");
	public final JLabel info2 = new JLabel("i casi in cui due persone differenti si ritrovano a possedere un");
	public final JLabel info3 = new JLabel("codice fiscale identico. L’unico codice valido è quello rilasciato");
	public final JLabel info4 = new JLabel("dall’Agenzia delle Entrate. Per giunta, l'applicazione non salva");
	public final JLabel info5 = new JLabel("i tuoi dati e non li sfrutta per fini esterni all'algoritmo di calcolo.");
	public final JLabel line = new JLabel();
	public final JLabel line2 = new JLabel();
	public final JLabel version = new JLabel("CF Calculator, by Richard Meoli");
	public final JLabel version2 = new JLabel("versione 2.0.0");
	public final JLabel line3 = new JLabel();

	// Constructor method

	public Gui(String text) {

		super(text);
		super.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("logo.png")).getImage());
		setSize(750, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width / 2) - (super.getWidth() / 2), (screenSize.height / 2) - (super.getHeight() / 2));
		setResizable(false);
		setLayout(null);
		setVisible(true);

		// Bounds Settings

		calcolo.setBounds(414, 250, 250, 55);
		field1.setBounds(510, 30, 200, 26);
		field2.setBounds(510, 60, 200, 26);
		field3.setBounds(510, 90, 200, 26);
		field5.setBounds(510, 150, 200, 26);
		field7.setBounds(510, 210, 200, 26);
		field4.setBounds(510, 120, 200, 26);
		field6.setBounds(510, 180, 200, 26);
		surnamel.setBounds(375, 30, 200, 26);
		namel.setBounds(375, 60, 200, 26);
		birthdayl.setBounds(375, 90, 200, 26);
		birthmonthl.setBounds(375, 120, 200, 26);
		birthyearl.setBounds(375, 150, 200, 26);
		sexl.setBounds(375, 180, 200, 26);
		comunel.setBounds(375, 210, 200, 26);
		result.setBounds(284, 308, 600, 100);
		phrase.setBounds(44, 306, 300, 100);
		title1.setBounds(23, -57, 300, 200);
		title2.setBounds(149, -20, 200, 200);
		title3.setBounds(32, 17, 350, 200);
		nb.setBounds(28, -34, 500, 400);
		info.setBounds(28, -34, 500, 400);
		info1.setBounds(28, -12, 500, 400);
		info2.setBounds(28, 10, 500, 400);
		info3.setBounds(28, 32, 500, 400);
		info4.setBounds(28, 54, 500, 400);
		info5.setBounds(28, 76, 500, 400);
		line.setBounds(350, -50, 4, 371);
		line2.setBounds(0, 320, 800, 4);
		copytoclipboard.setBounds(640, 335, 46, 46);
		version.setBounds(45, 201, 200, 400);
		version2.setBounds(630, 201, 200, 400);
		line3.setBounds(0, 390, 800, 1);
		aboutb.setBounds(5, 393, 16, 16);
		githubb.setBounds(22, 393, 16, 16);
		bugb.setBounds(715, 393, 16, 16);

		// General Settings

		title1.setHorizontalAlignment(SwingConstants.CENTER);
		title1.setHorizontalAlignment(SwingConstants.CENTER);
		title1.setHorizontalAlignment(SwingConstants.CENTER);

		calcolo.setVerticalAlignment(SwingConstants.BOTTOM);
		calcolo.setIcon(calc);
		calcolo.setRolloverIcon(hovercalc);
		calcolo.setPressedIcon(hovercalc);
		calcolo.setFocusPainted(false);
		calcolo.setBorder(null);
		calcolo.setContentAreaFilled(false);

		line.setBorder(BorderFactory.createLineBorder(Color.black));
		line2.setBorder(BorderFactory.createLineBorder(Color.black));
		line3.setBorder(BorderFactory.createLineBorder(Color.black));

		copytoclipboard.setIcon(copy);
		copytoclipboard.setRolloverIcon(hovercopy);
		copytoclipboard.setContentAreaFilled(false);
		copytoclipboard.setFocusPainted(false);
		copytoclipboard.setBorder(null);
		copytoclipboard.setToolTipText("Copia il codice");

		aboutb.setBorder(null);
		aboutb.setContentAreaFilled(false);
		aboutb.setIcon(about);
		aboutb.setRolloverIcon(hoverabout);
		aboutb.setToolTipText("About CF Calculator");

		githubb.setBorder(null);
		githubb.setContentAreaFilled(false);
		githubb.setIcon(github);
		githubb.setRolloverIcon(hovergithub);
		githubb.setToolTipText("Visualizza su Github");

		bugb.setBorder(null);
		bugb.setContentAreaFilled(false);
		bugb.setIcon(bug);
		bugb.setRolloverIcon(hoverbug);
		bugb.setToolTipText("Segnala un bug o proponi un suggerimento");

		getRootPane().setDefaultButton(calcolo);

		// Fonts

		Font labels = new Font("TimesRoman", Font.ITALIC, 15);
		Font resultf = new Font("Arial", Font.BOLD, 30);
		Font calcolof = new Font("Consolas", Font.PLAIN, 15);
		Font titlef = new Font("Georgia", Font.BOLD, 31);
		Font nbf = new Font("TimesRoman", Font.BOLD, 12);
		Font descriptionf = new Font("TimesRoman", Font.PLAIN, 12);
		Font phrasef = new Font("TimesRoman", Font.ITALIC, 24);
		Font creditsf = new Font("Arial", Font.BOLD, 11);

		surnamel.setFont(labels);
		namel.setFont(labels);
		birthdayl.setFont(labels);
		birthmonthl.setFont(labels);
		birthyearl.setFont(labels);
		sexl.setFont(labels);
		comunel.setFont(labels);
		result.setFont(resultf);
		phrase.setFont(phrasef);
		calcolo.setFont(calcolof);
		title1.setFont(titlef);
		title2.setFont(titlef);
		title3.setFont(titlef);
		nb.setFont(nbf);
		info.setFont(descriptionf);
		info1.setFont(descriptionf);
		info2.setFont(descriptionf);
		info3.setFont(descriptionf);
		info4.setFont(descriptionf);
		info5.setFont(descriptionf);
		title1.setForeground(Color.blue);
		title2.setForeground(Color.black);
		title3.setForeground(Color.blue);
		version.setFont(creditsf);
		version2.setFont(creditsf);

		// Shortcuts Listeners

		field1.addKeyListener(new Surname(this));
		field2.addKeyListener(new Name(this));
		field3.addKeyListener(new BirthDay(this));
		field4.addKeyListener(new BirthMonth(this));
		field5.addKeyListener(new BirthYear(this));
		field6.addKeyListener(new Sex(this));
		field7.addKeyListener(new BirthPlace(this));

		// Adding components

		add(calcolo);
		add(field1);
		add(field2);
		add(field3);
		add(field5);
		add(field7);
		add(field4);
		add(field6);
		add(surnamel);
		add(namel);
		add(birthdayl);
		add(birthmonthl);
		add(birthyearl);
		add(sexl);
		add(comunel);
		add(result);
		add(phrase);
		add(title1);
		add(title2);
		add(title3);
		add(nb);
		add(info);
		add(info1);
		add(info2);
		add(info3);
		add(info4);
		add(info5);
		add(line);
		add(line2);
		add(copytoclipboard);
		add(version);
		add(version2);
		add(aboutb);
		add(githubb);
		add(bugb);
		add(line3);

		// Events

		calcolo.addActionListener(new GetCode(this));
		copytoclipboard.addActionListener(new ClipBoard(this));
		aboutb.addActionListener(e -> {

			try {
				Desktop.getDesktop()
						.browse(new URI("https://github.com/RichardBoy05/Fiscal-Code-Calculator/blob/main/README.md"));
			} catch (IOException | URISyntaxException ee) {

				JOptionPane.showMessageDialog(null, ee);
			}
		});

		githubb.addActionListener(e -> {

			try {
				Desktop.getDesktop().browse(new URI("https://github.com/RichardBoy05/Fiscal-Code-Calculator"));
			} catch (IOException | URISyntaxException ee) {

				JOptionPane.showMessageDialog(null, ee);
			}
		});

		bugb.addActionListener(e -> {

			try {
				Desktop.getDesktop().browse(new URI("https://github.com/RichardBoy05/Fiscal-Code-Calculator/issues"));
			} catch (IOException | URISyntaxException ee) {

				JOptionPane.showMessageDialog(null, ee);
			}
		});

	}

}