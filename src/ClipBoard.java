
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.datatransfer.*;

public class ClipBoard implements ActionListener {
	
	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: ClipBoard
	 * Lines: 43
	 * Description: this class contains the method for copying the code into the user clipboard.
	 * 
	 * 
	 */

	private Gui cf;

	public ClipBoard(Gui cf) {

		this.cf = cf;
	}

	public void actionPerformed(ActionEvent e) {

		var clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		var string = this.cf.result.getText();
		
		StringSelection data = new StringSelection(string);

		if (string == "___________________")
			JOptionPane.showMessageDialog(null, "La stringa è vuota!");
		else
			clipboard.setContents(data, data);
			this.cf.field1.requestFocus();

	}

}