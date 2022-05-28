package Final;

import java.util.Scanner;

public class test {
	
	
	

	public static void main(String[] args) {
		 Scanner scan1 = new Scanner(System.in);
		    
		 	System.out.println("Please enter the bianry number : ");
		    String binary = scan1.next();
		    
		    // convert to decimal
		    long decimal = Long.parseLong(binary, 2);
		    System.out.println(binary + " in binary = " + decimal + " in decimal.");
		    int[] number = converter(decimal);
		    degitalFormat(number);
		    
	}
	
	
	static int[] converter(long num) {
		String str = Long.toString(num);
		System.out.println(str);
		int number[] = new int[str.length()];
		
		for(int i =0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			number[i] = str.charAt(i) - '0';
			System.out.println(number[i]);
		}
		
		return number;
	}
		    
		    
	static void degitalFormat(int[] number) {    
			
			// function call to check digit
			
				
				
				String [][] num=new String[10][4];
		        num[0][0]=" _ ";
		        num[0][1]="| |";
		        num[0][2]="| |";
		        num[6][3]=" -  ";

		        num[1][0]="  ";
		        num[1][1]=" |";
		        num[1][2]=" |";
		        num[6][3]="   ";

		        num[2][0]=" _ ";
		        num[2][1]=" _|";
		        num[2][2]=" |";
		        num[6][3]="  - ";

		        num[3][0]=" _";
		        num[3][1]=" _|";
		        num[3][2]=" _|";
		        num[6][3]="   ";
		        
		        num[4][0]="|_| ";
		        num[4][1]="  |";
		        num[4][2]="   ";
		        num[6][3]="   ";

		        num[5][0]="  _";
		        num[5][1]=" |_";
		        num[5][2]="  _|";
		        num[6][3]="   ";

		        num[6][0]=" _";
		        num[6][1]="| ";
		        num[6][2]=" - ";
		        num[6][3]="|_|";
		        
		        
		        num[7][0]=" _";
		        num[7][1]="  |";
		        num[7][2]="  |";
		        num[6][3]="   ";
		       
		        num[8][0]=" _ ";
		        num[8][1]="|_|";
		        num[8][2]="|_|";
		        num[6][3]="   ";

		        num[9][0]=" _";
		        num[9][1]="|_|";
		        num[9][2]=" _|";
		        num[6][3]="   ";

		      
		        for (int line = 0; line < 4; line++)
		        {          
		            for (int inputI=0; inputI < number.length; inputI++)
		            {
		                int value = number[inputI];
		                System.out.print(num[value][line]);
		                System.out.print("  ");
		            }          
		            System.out.println();
		        }
		    }
		}

			