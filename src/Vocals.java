
public class Vocals {
	
	 public static int vocals(char car)
	    {
	        char []vocali =
	        {
	            'A', 'E', 'I', 'O', 'U'
	        } ;
	        int i;
	        
	        for (i=0;i<vocali.length;i++)
	            if (car==vocali[i]) return 1;
	        
	        return 0;
	    }

}
