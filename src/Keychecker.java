
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * 
 * Author: Richard Meoli
 * 
 * Class: KeyChecker
 * Lines: 186
 * Description: these classes allow the user to use keyboard shortcuts.
 * 
 * 
 */

class Surname extends KeyAdapter {
	private Gui field;

	public Surname(Gui field) {
		this.field = field;
	}

	@Override
	public void keyPressed(KeyEvent event) {

		int ch = event.getKeyCode();

		if (ch == KeyEvent.VK_DOWN)
			this.field.field2.requestFocus();

	}

}

class Name extends KeyAdapter {
	private Gui field;

	public Name(Gui field) {
		this.field = field;
	}

	@Override
	public void keyPressed(KeyEvent event) {

		int ch = event.getKeyCode();

		if (ch == KeyEvent.VK_DOWN)
			this.field.field3.requestFocus();

		if (ch == KeyEvent.VK_UP)
			this.field.field1.requestFocus();

	}

}

class BirthDay extends KeyAdapter {
	private Gui field;

	public BirthDay(Gui field) {
		this.field = field;
	}

	@Override
	public void keyPressed(KeyEvent event) {

		int ch = event.getKeyCode();

		if (ch == KeyEvent.VK_DOWN)
			this.field.field4.requestFocus();

		if (ch == KeyEvent.VK_UP)
			this.field.field2.requestFocus();

		if (ch == KeyEvent.VK_ADD)
			if (this.field.field3.getSelectedIndex() < 30)
				this.field.field3.setSelectedIndex(this.field.field3.getSelectedIndex() + 1);

		if (ch == KeyEvent.VK_SUBTRACT)
			if (this.field.field3.getSelectedIndex() > 0)
				this.field.field3.setSelectedIndex(this.field.field3.getSelectedIndex() - 1);

	}

}

class BirthMonth extends KeyAdapter {
	private Gui field;

	public BirthMonth(Gui field) {
		this.field = field;
	}

	@Override
	public void keyPressed(KeyEvent event) {

		int ch = event.getKeyCode();

		if (ch == KeyEvent.VK_DOWN)
			this.field.field5.requestFocus();

		if (ch == KeyEvent.VK_UP)
			this.field.field3.requestFocus();

		if (ch == KeyEvent.VK_ADD)
			if (this.field.field4.getSelectedIndex() < 11)
				this.field.field4.setSelectedIndex(this.field.field4.getSelectedIndex() + 1);

		if (ch == KeyEvent.VK_SUBTRACT)
			if (this.field.field4.getSelectedIndex() > 0)
				this.field.field4.setSelectedIndex(this.field.field4.getSelectedIndex() - 1);

	}

}

class BirthYear extends KeyAdapter {
	private Gui field;

	public BirthYear(Gui field) {
		this.field = field;
	}

	@Override
	public void keyPressed(KeyEvent event) {

		int ch = event.getKeyCode();

		if (ch == KeyEvent.VK_DOWN)
			this.field.field6.requestFocus();

		if (ch == KeyEvent.VK_UP)
			this.field.field4.requestFocus();

	}

}

class Sex extends KeyAdapter {
	private Gui field;

	public Sex(Gui field) {
		this.field = field;
	}

	@Override
	public void keyPressed(KeyEvent event) {

		int ch = event.getKeyCode();

		if (ch == KeyEvent.VK_DOWN)
			this.field.field7.requestFocus();

		if (ch == KeyEvent.VK_UP)
			this.field.field5.requestFocus();

		if (ch == KeyEvent.VK_ADD)
			if (this.field.field6.getSelectedIndex() != 1)
				this.field.field6.setSelectedIndex(this.field.field6.getSelectedIndex() + 1);

		if (ch == KeyEvent.VK_SUBTRACT)
			if (this.field.field6.getSelectedIndex() != 0)
				this.field.field6.setSelectedIndex(this.field.field6.getSelectedIndex() - 1);

	}

}

class BirthPlace extends KeyAdapter {
	private Gui field;

	public BirthPlace(Gui field) {
		this.field = field;
	}

	@Override
	public void keyPressed(KeyEvent event) {

		int ch = event.getKeyCode();

		if (ch == KeyEvent.VK_UP)
			this.field.field6.requestFocus();

	}

}