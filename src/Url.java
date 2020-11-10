import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.net.*;
import java.io.IOException;

public class Url implements ActionListener{
	
	private Cf url;
	
	public Url(Cf url) {
		this.url = url;
	}
	
	// Open Url
	
	public void actionPerformed(ActionEvent e) {
		
		try{
			Desktop.getDesktop().browse(new URI("https://it.wikipedia.org/wiki/Codice_fiscale#:~:text=Per%20le%20persone%20fisiche%2C%20il,9%20per%20quelle%20non%20riconosciute)."));
	    }
	    catch(IOException ex){
	    }
		catch(URISyntaxException exs) {
			
		}
	
	}

}
