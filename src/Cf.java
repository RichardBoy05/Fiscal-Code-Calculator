import java.awt.*;
import javax.swing.*;

public class Cf extends JFrame{
	
	// Buttons
	
	public final JButton calcolo = new JButton("Calcola il codice!");
	public final JButton qui = new JButton("qui");
	
	
	// Textfields
	
	public final JTextField surname = new JTextField();
	public final JTextField name = new JTextField();
	public final JTextField birthyear = new JTextField();
	public final JTextField comune = new JTextField();
	
	
	// Comboboxes
	
	String[] giorni = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	public final JComboBox<String> birthday = new JComboBox<String>(giorni);
	
	String[] mesi = {"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};
	public final JComboBox<String> month = new JComboBox<String>(mesi);
	
	String[] sex1 = {"M","F"};
	public final JComboBox<String> sex = new JComboBox<String>(sex1);

	
	// Labels
	
	public final JLabel surnamel = new JLabel("Cognome:");
	public final JLabel namel = new JLabel("Nome:");
	public final JLabel birthdayl = new JLabel("Giorno di nascita:");
	public final JLabel birthmonthl = new JLabel("Mese di nascita:");
	public final JLabel birthyearl = new JLabel("Anno di nascita:");
	public final JLabel sexl = new JLabel("Sesso:");
	public final JLabel comunel = new JLabel("Comune di nascita:");
	public JLabel result = new JLabel("________________");
	public final JLabel phrase = new JLabel("Il tuo codice fiscale è:");
	public final JLabel title1 = new JLabel("CALCOLA");
	public final JLabel title2 = new JLabel("IL TUO");
	public final JLabel title3 = new JLabel("CODICE FISCALE");
	public final JLabel info = new JLabel("Questo calcolatore ti permette di ricavare il tuo");
	public final JLabel info1 = new JLabel("codice fiscale una volta inseriti alcuni dati");
	public final JLabel info2 = new JLabel("personali necessari.");
	public final JLabel info3 = new JLabel("Il programma non salva i tuoi dati e non li utilizza");
	public final JLabel info4 = new JLabel("per fini al di fuori dell'algoritmo di calcolo.");
	public final JLabel info5 = new JLabel("Se desideri imparare come ricavare il tuo codice");
	public final JLabel info6 = new JLabel("fiscale, consulta la Wiki ufficiale cliccando");
	
	public final JLabel line = new JLabel("");
	public final JLabel line2 = new JLabel("");
	
	public final JLabel credits = new JLabel("Richard Meoli, v 1.0.0");
	
	
	// Constructor method
	
	public Cf(String text) {
		super(text);
		super.setIconImage (new ImageIcon (getClass().getClassLoader().getResource("logo.png")).getImage ());
		setSize(750, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit ( ).getScreenSize ( );
		setLocation ( ( screenSize.width / 2 ) - ( super.getWidth ( ) / 2 ), (screenSize.height / 2 ) - ( super.getHeight ( ) / 2 ) );
		setResizable(false);
		setLayout(null);
		setVisible(true);
		
		calcolo.setBounds(450,260,210,35);
		calcolo.setVerticalAlignment(SwingConstants.BOTTOM);
		
		surname.setBounds(510,30,200,26);
		name.setBounds(510,60,200,26);
		birthday.setBounds(510,90,200,26);
		birthyear.setBounds(510,150,200,26);
		comune.setBounds(510,210,200,26);
		
		month.setBounds(510,120,200,26);
		sex.setBounds(510,180,200,26);
		
		surnamel.setBounds(375,30,200,26);
		namel.setBounds(375,60,200,26);
		birthdayl.setBounds(375,90,200,26);
		birthmonthl.setBounds(375,120,200,26);
		birthyearl.setBounds(375,150,200,26);
		sexl.setBounds(375,180,200,26);
		comunel.setBounds(375,210,200,26);
		
		result.setBounds(380,313,600,100);
		
		phrase.setBounds(100,310,300,100);
		
		title1.setBounds(24,-57,200,200);
		title2.setBounds(24,-20,200,200);
		title3.setBounds(24,17,350,200);
		
		
		info.setBounds(24,-30,500,400);
		info1.setBounds(24,-10,500,400);
		info2.setBounds(24,10,500,400);
		info3.setBounds(24,30,500,400);
		info4.setBounds(24,50,500,400);
		info5.setBounds(24,70,500,400);
		info6.setBounds(24,90,500,400);
		
		qui.setBounds(280,282,51,20);
		qui.setVerticalAlignment(SwingConstants.CENTER);
		
		
		line.setBounds(350,-50,4,371);
		line2.setBounds(0,320,800,4);

		
		line.setBorder(
		BorderFactory.createLineBorder(Color.black));
		line2.setBorder(
				BorderFactory.createLineBorder(Color.black));
		
		credits.setBounds(4,203,200,400);

		
		// Fonts
		
		Font labels;
		labels = new Font("TimesRoman", Font.ITALIC, 15);
		
		Font resultf;
		resultf = new Font("Arial", Font.BOLD, 28);
		
		Font calcolof;
		calcolof = new Font("Consolas", Font.PLAIN, 15);
		
		Font titlef;
		titlef = new Font("Georgia", Font.BOLD, 31);

		Font descriptionf;
		descriptionf = new Font("TimesRoman", Font.PLAIN, 16);
		
		Font phrasef;
		phrasef = new Font("TimesRoman", Font.ITALIC, 28);
		
		Font creditsf;
		creditsf = new Font("Arial", Font.BOLD, 9);
		
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
		
		info.setFont(descriptionf);
		info1.setFont(descriptionf);
		info2.setFont(descriptionf);
		info3.setFont(descriptionf);
		info4.setFont(descriptionf);
		info5.setFont(descriptionf);
		info6.setFont(descriptionf);
		
		title1.setForeground(Color.blue);
		title2.setForeground(Color.black);
		title3.setForeground(Color.blue);
		
		credits.setFont(creditsf);
		
		// Adding the components
		
		add(calcolo);
		
		add(surname);
		add(name);
		add(birthday);
		add(birthyear);
		add(comune);
		
		add(month);
		add(sex);
		
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
		
		add(info);
		add(info1);
		add(info2);
		add(info3);
		add(info4);
		add(info5);
		add(info6);
		
		add(qui);
		
		add(line);
		add(line2);
		
		add(credits);
		
		// Events
		
		calcolo.addActionListener(new Button(this));
		qui.addActionListener(new Url(this));
		

	}

	

}
