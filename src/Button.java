import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Button implements ActionListener{
	
	private Cf butt;
	
	public Button(Cf butt) {
		this.butt = butt;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		// Exceptions handling
		
		if(!e.getSource().equals(this.butt.calcolo))
			return;
		
		if(this.butt.surname.getText().isEmpty()) {
			this.butt.result.setText("________________");
			JOptionPane.showMessageDialog(null, "Cognome mancante!");
			return;
		}
			
			if(this.butt.name.getText().isEmpty()) {
				this.butt.result.setText("________________");
				JOptionPane.showMessageDialog(null, "Nome mancante!");
				return;
		}
			
			if(this.butt.birthyear.getText().isEmpty()) {
				this.butt.result.setText("________________");
				JOptionPane.showMessageDialog(null, "Anno mancante!");
				return;
		}
			if(this.butt.birthyear.getText().length()!=4) {
				this.butt.result.setText("________________");
				JOptionPane.showMessageDialog(null, "L'anno deve essere espresso in 4 cifre!");
				return;
			}
			

		// GetSurname (starts)
		
		String surname = this.butt.surname.getText();

	        String cons, voc;
	        int lung;
	        int i, sw;
	        
	        surname=surname.toUpperCase();
	        lung=surname.length();
	        voc=""; cons="";
	        for (i=0;i<lung;i++)
	        {
	            sw=Vocals.vocals(surname.charAt(i));
	            
	            if (sw==1) {
	                sw=0;
	                if (voc.length()<3) voc+=surname.charAt(i);
	            } else {
	                if (surname.charAt(i) > 65 & surname.charAt(i) < 91) {
	                    cons=cons+surname.charAt(i);
	                    if (cons.length()==3)
	                    {
	                        voc=""; break;
	                    }
	                }
	            }
	        }
	        if (cons.length()<3)
	        {
	            if (cons.length()==2) cons=cons+voc.charAt(0);
	            if (cons.length()==1) {
	                if (voc.length()>1) {
	                    cons=cons+voc.charAt(0)+voc.charAt(1);
	                } else {
	                    cons=cons+voc.charAt(0)+"X";
	                }
	            }
	            if (cons.length()==0) {
	                if (voc.length()<3) cons=voc+"X";
	                else cons=voc;
	            }
	        }
	     
	        // GetSurname (ends)
	        
	        
	        //////////////////////////////////////////////////////////////
	        
	        
	        //GetName (starts)

	        
	        String name = this.butt.name.getText();
			
			
			String consn, vocn, comn;
	        int lungn;
	        int in, swn;
	        
	        name=name.toUpperCase();
	        lungn=name.length();
	        vocn=""; consn=""; comn="";
	        for (in=0;in<lungn;in++)
	        {
	            swn=Vocals.vocals(name.charAt(in));
	            
	            if (swn==1) {
	                swn=0;
	                if (vocn.length()<3) vocn+=name.charAt(in);
	            } else {
	                if (name.charAt(in) > 65 & name.charAt(in) < 91) {
	                    consn=consn+name.charAt(in);
	                    if (consn.length()==4)
	                    {
	                        vocn=""; break;
	                    }
	                }
	            }
	        } 
	        if (consn.length()<3)
	        {
	            if (consn.length()==2) consn=consn+vocn.charAt(0);
	            if (consn.length()==1) {
	                if (vocn.length()>1) {
	                    consn=consn+vocn.charAt(0)+vocn.charAt(1);
	                } else {
	                    consn=consn+vocn.charAt(0)+"X";
	                }
	            }
	            if (consn.length()==0) 
	            {
	                if (vocn.length()<3) consn=vocn+"X";
	                else consn=vocn;
	            }
	        }
	        if (consn.length()>3) 
	        {
	            comn=consn; consn="";
	            consn=consn+comn.charAt(0)+comn.charAt(2)+comn.charAt(3);
	        }

	        // GetName (ends)
	        
			
            //////////////////////////////////////////////////////////////
	        
	        
	        // GetYear (starts)
	        
	        
	        String year = this.butt.birthyear.getText();
	        
	    	String outyear = "";
	    		
	    		outyear = year.substring(2,4);

	        
	    	// GetYear (ends)
	    		
	    		
            //////////////////////////////////////////////////////////////
	    		
	    	
	    	// GetMonth (starts)
	    	
	    	
	    	String month = this.butt.month.getSelectedItem().toString();
	    	
	    	
	    	String outmonth = "";
			
			if (month.equals("Gennaio")) {
				outmonth = "A";
			} else {
				if (month.equals("Febbraio")) {
					outmonth = "B";
			} else {
				if (month.equals("Marzo")) {
					outmonth = "C";	
			} else {
				if (month.equals("Aprile")) {
					outmonth = "D";	
			} else {
				if (month.equals("Maggio")) {
					outmonth = "E";	
			} else {
				if (month.equals("Giugno")) {
					outmonth = "H";	
			} else {
				if (month.equals("Luglio")) {
					outmonth = "L";	
			} else {
				if (month.equals("Agosto")) {
					outmonth = "M";	
			} else {
				if (month.equals("Settembre")) {
					outmonth = "P";	
			} else {
				if (month.equals("Ottobre")) {
					outmonth = "R";	
			} else {
				if (month.equals("Novembre")) {
					outmonth = "S";	
			} else {
				if (month.equals("Dicembre")) {
					outmonth = "T";	
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
	
	
			
            // GetMonth (ends)
			
			
            //////////////////////////////////////////////////////////////
			
			
			// GetDay (starts)
			
			
			String birthday = this.butt.birthday.getSelectedItem().toString();
			int day = Integer.parseInt(birthday);
			
			int outputday = 0;
			
				outputday = day;

			// GetDay (ends)

				
	        //////////////////////////////////////////////////////////////
				
				
			// GetSex (starts)
			
			String sex = this.butt.sex.getSelectedItem().toString();
			
			int outputsex = 0;
			String outputdaysexint = "";
			
			if (sex.equals("M")) {
				outputsex = 0;
			} else {
				if (sex.equals("F")) {
					outputsex = 40;

			}
			}
			
			if ((outputday + outputsex) < 10) {
	        	outputdaysexint = ("0"+ (outputday + outputsex));
	        	
	        } else {
	        	outputdaysexint = (""+ (outputday + outputsex));
	        	
	        }

			
			// GetSex (ends)
			
			
            //////////////////////////////////////////////////////////////
			
			
			// GetComune (starts)
			
			String comune = this.butt.comune.getText();
			
			String outputcom = "";
			String linea;
		    try{
		        BufferedReader inStream = new BufferedReader(new InputStreamReader(new FileInputStream("Comuni.txt")));
		        while(inStream.hashCode() != -1){
		            linea = inStream.readLine();
		            String [] s = linea.split(";");
		            if(!comune.equalsIgnoreCase(s[0])) {
		            
		            
		            } else {
		           
		            	outputcom = s[1];
		            
		            }
		            
		            }
		   
		    
		    }
		    
		    catch (Exception ee){
		    }
		    
		    String resultot = "";
		    resultot = cons + consn + outyear + outmonth + outputdaysexint + outputcom;
		    
		    if(resultot.length() < 15) {
		    	
		    	this.butt.result.setText("________________");
		    	JOptionPane.showMessageDialog(null, "Comune mancante o inesistente!");
		    	
		    }
		    
			// GetComune (ends)
		    
		    
            //////////////////////////////////////////////////////////////
		    
		    
		    // GetControlCode (starts)
		    
		    
		    String cin = "";
		    int par0 = 0;
	        int par1 = 0;
	        int par2 = 0;
	        int par3 = 0;
	        int par4 = 0;
	        int par5 = 0;
	        int par6 = 0;
	        int par7 = 0;
	        int par8 = 0;
	        int par9 = 0;
	        int par10 = 0;
	        int par11 = 0;
	        int par12 = 0;
	        int par13 = 0;
	        int par14 = 0;
	        int par15 = 0;
	        int par16 = 0;
	        int par17 = 0;
	        int par18 = 0;
	        int par19 = 0;
	        int par20 = 0;
	        int par21 = 0;
	        int par22 = 0;
	        int par23 = 0;
	        int par24 = 0;
	        int par25 = 0;
	        int par26 = 0;
	        int par27 = 0;
	        int par28 = 0;
	        int par29 = 0;
	        int par30 = 0;
	        int par31 = 0;
	        int par32 = 0;
	        int par33 = 0;
	        int par34 = 0;
	        int par35 = 0;
	        int partot = 0;

	        
	        char p0 = resultot.charAt(1);
	        char p1 = resultot.charAt(3);
	        char p2 = resultot.charAt(5);
	        char p3 = resultot.charAt(7);
	        char p4 = resultot.charAt(9);
	        char p5 = resultot.charAt(11);
	        char p6 = resultot.charAt(13);
	        
	        char[] arr = {p0, p1, p2, p3, p4, p5, p6};
	        
	        for (int o = 0; o < arr.length; o++) {
	        	if (arr[o] == 'R')
	                    par0 ++;
	        }
	                    
	                    for (int o = 0; o < arr.length; o++) {
	                    	if (arr[o] == '0')
	                                par1 ++;
	                    }
	                                
	                                for (int o = 0; o < arr.length; o++) {
	                                	if (arr[o] == '1')
	                                            par2 ++;
	                                }
	                                            
	                                            
	                                            for (int o = 0; o < arr.length; o++) {
	                                            	if (arr[o] == '2')
	                                                        par3 ++;
	                                            }
	                                                        
	                                                        
	                                                        for (int o = 0; o < arr.length; o++) {
	                                                        	if (arr[o] == '3')
	                                                                    par4 ++;
	                                                        }
	                                                                    
	                                                                    
	                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                    	if (arr[o] == '4')
	                                                                                par5 ++;
	                                                                    }
	                                                                                
	        
	                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                	if (arr[o] == '5')
	                                                                                            par6 ++;
	                                                                                }
	                                                                                           
	                                                                                            
	                                                                                            
	                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                            	if (arr[o] == '6')
	                                                                                                        par7 ++;
	                                                                                            }
	                                                                                                       
	                                                                                                        
	                                                                                                        for (int o = 0; o < arr.length; o++) {
	                                                                                                        	if (arr[o] == '7')
	                                                                                                                    par8 ++;
	                                                                                                        }
	                                                                                                                    
	                                                                                                                    
	                                                                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                                                                    	if (arr[o] == '8')
	                                                                                                                                par9 ++;
	                                                                                                                    }
	                                                                                                                                
	                                                                                                                                
	                                                                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                                                                	if (arr[o] == '9')
	                                                                                                                                            par10 ++;
	                                                                                                                                }
	                                                                                                                                           
	                                                                                                                                            
	                                                                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                                                                            	if (arr[o] == 'A')
	                                                                                                                                                        par11 ++;
	                                                                                                                                            }
	                                                                                                                                                       
	                                                                                                                                                        
	                                                                                                                                                        for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                        	if (arr[o] == 'B')
	                                                                                                                                                                    par12 ++;
	                                                                                                                                                        }
	                                                                                                                                                                    
	                                                                                                                                                                    
	                                                                                                                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                    	if (arr[o] == 'C')
	                                                                                                                                                                                par13 ++;
	                                                                                                                                                                    }
	                                                                                                                                                                              
	                                                                                                                                                                                
	                                                                                                                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                	if (arr[o] == 'D')
	                                                                                                                                                                                            par14 ++;
	                                                                                                                                                                                }
	                                                                                                                                                                                            
	                                                                                                                                                                                            
	                                                                                                                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                            	if (arr[o] == 'E')
	                                                                                                                                                                                                        par15 ++;
	                                                                                                                                                                                            }
	                                                                                                                                                                                                        
	                                                                                                                                                                                                        
	                                                                                                                                                                                                        for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                        	if (arr[o] == 'F')
	                                                                                                                                                                                                                    par16 ++;
	                                                                                                                                                                                                        }
	                                                                                                                                                                                                                    
	                                                                                                                                                                                                                    
	                                                                                                                                                                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                    	if (arr[o] == 'G')
	                                                                                                                                                                                                                                par17 ++;
	                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                               
	                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                	if (arr[o] == 'H')
	                                                                                                                                                                                                                                            par18 ++;
	                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                            	if (arr[o] == 'I')
	                                                                                                                                                                                                                                                        par19 ++;
	                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                        for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                        	if (arr[o] == 'J')
	                                                                                                                                                                                                                                                                    par20 ++;
	                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                   
	                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                    	if (arr[o] == 'K')
	                                                                                                                                                                                                                                                                                par21 ++;
	                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                	if (arr[o] == 'L')
	                                                                                                                                                                                                                                                                                            par22 ++;
	                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                           
	                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                            	if (arr[o] == 'M')
	                                                                                                                                                                                                                                                                                                        par23 ++;
	                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                       
	                                                                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                                                                        for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                        	if (arr[o] == 'N')
	                                                                                                                                                                                                                                                                                                                    par24 ++;
	                                                                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                    	if (arr[o] == 'O')
	                                                                                                                                                                                                                                                                                                                                par25 ++;
	                                                                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                	if (arr[o] == 'P')
	                                                                                                                                                                                                                                                                                                                                            par26 ++;
	                                                                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                            	if (arr[o] == 'Q')
	                                                                                                                                                                                                                                                                                                                                                        par27 ++;
	                                                                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                                                                       
	                                                                                                                                                                                                                                                                                                                                  
	                                                                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                    	if (arr[o] == 'S')
	                                                                                                                                                                                                                                                                                                                                                                                par28 ++;
	                                                                                                                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                                                                                                               
	                                                                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                	if (arr[o] == 'T')
	                                                                                                                                                                                                                                                                                                                                                                                            par29 ++;
	                                                                                                                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                                                                                                                           
	                                                                                                                                                                                                                                                                                                                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                            	if (arr[o] == 'U')
	                                                                                                                                                                                                                                                                                                                                                                                                        par30 ++;
	                                                                                                                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                                                                                                                      
	                                                                                                                                                                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                                                                                                                                                                        for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                        	if (arr[o] == 'V')
	                                                                                                                                                                                                                                                                                                                                                                                                                    par31 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                                                                                                                                                                  
	                                                                                                                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                                                                                                                    for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                    	if (arr[o] == 'W')
	                                                                                                                                                                                                                                                                                                                                                                                                                                par32 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                                                                                                                                                               
	                                                                                                                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                                                                                                                for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                                	if (arr[o] == 'X')
	                                                                                                                                                                                                                                                                                                                                                                                                                                            par33 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                                                                                                                            for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                                            	if (arr[o] == 'Y')
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        par34 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        for (int o = 0; o < arr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        	if (arr[o] == 'Z')
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                    par35 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                                                                            
	        partot = (par0 * 17) + (par1 * 0) + (par2 * 1) + (par3 * 2) + (par4 * 3) + (par5 * 4) + (par6 * 5) + (par7 * 6) + (par8 * 7) + (par9 * 8) + (par10 * 9) + (par11 * 0) + (par12 * 1) + (par13 * 2) + (par14 * 3) + (par15 * 4) + (par16 * 5) + (par17 * 6) + (par18 * 7) + (par19 * 8) + (par20 * 9) + (par21 * 10) + (par22 * 11) + (par23 * 12) + (par24 * 13) + (par25 * 14) + (par26 * 15) + (par27 * 16) + (par28 * 18) + (par29 * 19) + (par30 * 20) + (par31 * 21) + (par32 * 22) + (par33 * 23) + (par34 * 24) + (par35 * 25);
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	        
	        
	        
	        
	        
	        
	        int dpar0 = 0;
	        int dpar1 = 0;
	        int dpar2 = 0;
	        int dpar3 = 0;
	        int dpar4 = 0;
	        int dpar5 = 0;
	        int dpar6 = 0;
	        int dpar7 = 0;
	        int dpar8 = 0;
	        int dpar9 = 0;
	        int dpar10 = 0;
	        int dpar11 = 0;
	        int dpar12 = 0;
	        int dpar13 = 0;
	        int dpar14 = 0;
	        int dpar15 = 0;
	        int dpar16 = 0;
	        int dpar17 = 0;
	        int dpar18 = 0;
	        int dpar19 = 0;
	        int dpar20 = 0;
	        int dpar21 = 0;
	        int dpar22 = 0;
	        int dpar23 = 0;
	        int dpar24 = 0;
	        int dpar25 = 0;
	        int dpar26 = 0;
	        int dpar27 = 0;
	        int dpar28 = 0;
	        int dpar29 = 0;
	        int dpar30 = 0;
	        int dpar31 = 0;
	        int dpar32 = 0;
	        int dpar33 = 0;
	        int dpar34 = 0;
	        int dpar35 = 0;
	        int dpartot = 0;

	        
	        char dp0 = resultot.charAt(0);
	        char dp1 = resultot.charAt(2);
	        char dp2 = resultot.charAt(4);
	        char dp3 = resultot.charAt(6);
	        char dp4 = resultot.charAt(8);
	        char dp5 = resultot.charAt(10);
	        char dp6 = resultot.charAt(12);
	        char dp7 = resultot.charAt(14);
	        
	        char[] darr = {dp0, dp1, dp2, dp3, dp4, dp5, dp6, dp7};
	        
	        for (int o = 0; o < darr.length; o++) {
	        	if (darr[o] == 'R')
	                    dpar0 ++;
	        }
	                    
	                    for (int o = 0; o < darr.length; o++) {
	                    	if (darr[o] == '0')
	                                dpar1 ++;
	                    }
	                                
	                                for (int o = 0; o < darr.length; o++) {
	                                	if (darr[o] == '1')
	                                            dpar2 ++;
	                                }
	                                            
	                                            
	                                            for (int o = 0; o < darr.length; o++) {
	                                            	if (darr[o] == '2')
	                                                        dpar3 ++;
	                                            }
	                                                        
	                                                        
	                                                        for (int o = 0; o < darr.length; o++) {
	                                                        	if (darr[o] == '3')
	                                                                    dpar4 ++;
	                                                        }
	                                                                    
	                                                                    
	                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                    	if (darr[o] == '4')
	                                                                                dpar5 ++;
	                                                                    }
	                                                                                
	        
	                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                	if (darr[o] == '5')
	                                                                                            dpar6 ++;
	                                                                                }
	                                                                                           
	                                                                                            
	                                                                                            
	                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                            	if (darr[o] == '6')
	                                                                                                        dpar7 ++;
	                                                                                            }
	                                                                                                       
	                                                                                                        
	                                                                                                        for (int o = 0; o < darr.length; o++) {
	                                                                                                        	if (darr[o] == '7')
	                                                                                                                    dpar8 ++;
	                                                                                                        }
	                                                                                                                    
	                                                                                                                    
	                                                                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                                                                    	if (darr[o] == '8')
	                                                                                                                                dpar9 ++;
	                                                                                                                    }
	                                                                                                                                
	                                                                                                                                
	                                                                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                                                                	if (darr[o] == '9')
	                                                                                                                                            dpar10 ++;
	                                                                                                                                }
	                                                                                                                                           
	                                                                                                                                            
	                                                                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                                                                            	if (darr[o] == 'A')
	                                                                                                                                                        dpar11 ++;
	                                                                                                                                            }
	                                                                                                                                                       
	                                                                                                                                                        
	                                                                                                                                                        for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                        	if (darr[o] == 'B')
	                                                                                                                                                                    dpar12 ++;
	                                                                                                                                                        }
	                                                                                                                                                                    
	                                                                                                                                                                    
	                                                                                                                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                    	if (darr[o] == 'C')
	                                                                                                                                                                                dpar13 ++;
	                                                                                                                                                                    }
	                                                                                                                                                                              
	                                                                                                                                                                                
	                                                                                                                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                	if (darr[o] == 'D')
	                                                                                                                                                                                            dpar14 ++;
	                                                                                                                                                                                }
	                                                                                                                                                                                            
	                                                                                                                                                                                            
	                                                                                                                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                            	if (darr[o] == 'E')
	                                                                                                                                                                                                        dpar15 ++;
	                                                                                                                                                                                            }
	                                                                                                                                                                                                        
	                                                                                                                                                                                                        
	                                                                                                                                                                                                        for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                        	if (darr[o] == 'F')
	                                                                                                                                                                                                                    dpar16 ++;
	                                                                                                                                                                                                        }
	                                                                                                                                                                                                                    
	                                                                                                                                                                                                                    
	                                                                                                                                                                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                    	if (darr[o] == 'G')
	                                                                                                                                                                                                                                dpar17 ++;
	                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                               
	                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                	if (darr[o] == 'H')
	                                                                                                                                                                                                                                            dpar18 ++;
	                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                            	if (darr[o] == 'I')
	                                                                                                                                                                                                                                                        dpar19 ++;
	                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                        for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                        	if (darr[o] == 'J')
	                                                                                                                                                                                                                                                                    dpar20 ++;
	                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                   
	                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                    	if (darr[o] == 'K')
	                                                                                                                                                                                                                                                                                dpar21 ++;
	                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                	if (darr[o] == 'L')
	                                                                                                                                                                                                                                                                                            dpar22 ++;
	                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                           
	                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                            	if (darr[o] == 'M')
	                                                                                                                                                                                                                                                                                                        dpar23 ++;
	                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                       
	                                                                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                                                                        for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                        	if (darr[o] == 'N')
	                                                                                                                                                                                                                                                                                                                    dpar24 ++;
	                                                                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                    	if (darr[o] == 'O')
	                                                                                                                                                                                                                                                                                                                                dpar25 ++;
	                                                                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                	if (darr[o] == 'P')
	                                                                                                                                                                                                                                                                                                                                            dpar26 ++;
	                                                                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                            	if (darr[o] == 'Q')
	                                                                                                                                                                                                                                                                                                                                                        dpar27 ++;
	                                                                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                                                                       
	                                                                                                                                                                                                                                                                                                                                  
	                                                                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                    	if (darr[o] == 'S')
	                                                                                                                                                                                                                                                                                                                                                                                dpar28 ++;
	                                                                                                                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                                                                                                               
	                                                                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                	if (darr[o] == 'T')
	                                                                                                                                                                                                                                                                                                                                                                                            dpar29 ++;
	                                                                                                                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                                                                                                                           
	                                                                                                                                                                                                                                                                                                                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                            	if (darr[o] == 'U')
	                                                                                                                                                                                                                                                                                                                                                                                                        dpar30 ++;
	                                                                                                                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                                                                                                                      
	                                                                                                                                                                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                                                                                                                                                                        for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                        	if (darr[o] == 'V')
	                                                                                                                                                                                                                                                                                                                                                                                                                    dpar31 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                                                                                                                                                                  
	                                                                                                                                                                                                                                                                                                                                                                                                                    
	                                                                                                                                                                                                                                                                                                                                                                                                                    for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                    	if (darr[o] == 'W')
	                                                                                                                                                                                                                                                                                                                                                                                                                                dpar32 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                    }
	                                                                                                                                                                                                                                                                                                                                                                                                                               
	                                                                                                                                                                                                                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                                                                                                                                                                                                                for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                                	if (darr[o] == 'X')
	                                                                                                                                                                                                                                                                                                                                                                                                                                            dpar33 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                                }
	                                                                                                                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                                                                                                                            
	                                                                                                                                                                                                                                                                                                                                                                                                                                            for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                                            	if (darr[o] == 'Y')
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        dpar34 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                                            }
	                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        for (int o = 0; o < darr.length; o++) {
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        	if (darr[o] == 'Z')
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                    dpar35 ++;
	                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
	                                                                                                                                                                                                                                                                                                                            
	        dpartot = (dpar0 * 8) + (dpar1 * 1) + (dpar2 * 0) + (dpar3 * 5) + (dpar4 * 7) + (dpar5 * 9) + (dpar6 * 13) + (dpar7 * 15) + (dpar8 * 17) + (dpar9 * 19) + (dpar10 * 21) + (dpar11 * 1) + (dpar12 * 0) + (dpar13 * 5) + (dpar14 * 7) + (dpar15 * 9) + (dpar16 * 13) + (dpar17 * 15) + (dpar18 * 17) + (dpar19 * 19) + (dpar20 * 21) + (dpar21 * 2) + (dpar22 * 4) + (dpar23 * 18) + (dpar24 * 20) + (dpar25 * 11) + (dpar26 * 3) + (dpar27 * 6) + (dpar28 * 12) + (dpar29 * 14) + (dpar30 * 16) + (dpar31 * 10) + (dpar32 * 22) + (dpar33 * 25) + (dpar34 * 24) + (dpar35 * 23);
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	        
	        
	        
	        int cintot = (partot + dpartot) / 26;
	        int sottraendo = cintot * 26;
	        int resto = (partot + dpartot) - sottraendo;
	        
	        if (resto == 0) {
	        	cin = "A";
	        } else {
	        if (resto == 1) {
	            	cin = "B";
	        } else {
	        	if (resto == 2) {
	            	cin = "C";
	        } else {
	        	if (resto == 3) {
	            	cin = "D";
	        } else {
	        	if (resto == 4) {
	            	cin = "E";
	        } else {
	        	if (resto == 5) {
	            	cin = "F";
	        } else {
	        	if (resto == 6) {
	            	cin = "G";
	        } else {
	        	if (resto == 7) {
	            	cin = "H";
	        } else {
	        	if (resto == 8) {
	            	cin = "I";
	        } else {
	        	if (resto == 9) {
	            	cin = "J";
	        } else {
	        	if (resto == 10) {
	            	cin = "K";
	        } else {
	        	if (resto == 11) {
	            	cin = "L";
	        } else {
	        	if (resto == 12) {
	            	cin = "M";
	        } else {
	        	if (resto == 13) {
	            	cin = "N";
	        } else {
	        	if (resto == 14) {
	            	cin = "O";
	        } else {
	        	if (resto == 15) {
	            	cin = "P";
	        } else {
	        	if (resto == 16) {
	            	cin = "Q";
	        } else {
	        	if (resto == 17) {
	            	cin = "R";
	        } else {
	        	if (resto == 18) {
	            	cin = "S";
	        } else {
	        	if (resto == 19) {
	            	cin = "T";
	        } else {
	        	if (resto == 20) {
	            	cin = "U";
	        } else {
	        	if (resto == 21) {
	            	cin = "V";
	        } else {
	        	if (resto == 22) {
	            	cin = "W";
	        } else {
	        	if (resto == 23) {
	            	cin = "X";
	        } else {
	        	if (resto == 24) {
	            	cin = "Y";
	        } else {
	        	if (resto == 25) {
	            	cin = "Z";
	        } else {
	        	JOptionPane.showMessageDialog(null, "Errore di calcolo inaspettato. Riavvia il programma!");
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        }
	        

	        String resultintero = (resultot + cin);
	        
	        this.butt.result.setText(resultintero);


	        
	        }
	        
	        
	        
	        //GetControlCode (ends)
	    	
	        
	        
	        
	        
 
	
}
