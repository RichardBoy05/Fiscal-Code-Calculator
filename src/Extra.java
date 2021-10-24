
public class Extra {

	/*
	 * 
	 * Author: Richard Meoli
	 * 
	 * Class: Extra
	 * Lines: 27
	 * Description: class for extra methods.
	 * 
	 * 
	 */

	public static int vocals(char car) {

		char[] vocali = { 'A', 'E', 'I', 'O', 'U' };
		int i;

		for (i = 0; i < vocali.length; i++)
			if (car == vocali[i])
				return 1;

		return 0;
	}

}