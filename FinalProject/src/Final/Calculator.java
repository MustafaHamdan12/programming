package Final;

import java.util.Scanner;



public class Calculator {

		public static void main(String[] args) {
			Scanner scan1 = new Scanner(System.in);
			// binary number
			System.out.println("Please enter the binary number : ");
		    long num = scan1.nextLong();

		    // call method and giving the binary number
		    int decimal = convertBinaryToDecimal(num);
		    System.out.println("Number in decimal is  = " + decimal);
		    
		    int[] num1 = converter(decimal);
		    
		    degitalFormat(num1);
		    
		  }

		  public static int convertBinaryToDecimal(long num) {
		    int decimalNumber = 0, i = 0;
		    long remainder;
		    
		    while (num != 0) {
		      remainder = num % 10;
		      num /= 10;
		      decimalNumber += remainder * Math.pow(2, i);
		      i++;
		    }
		    
		    return decimalNumber;
		  }
		
		
		static int[] converter(long num) {
			String str = Long.toString(num);
			int arrLen = str.length();
			int number[] = new int[arrLen];
			
			for(int i =0; i < arrLen; i++) {

				number[i] = (int) str.charAt(i) - '0';
				
			}
			
			return number;
		}
			    
			    
		static void degitalFormat(int[] number) {    
				
			String [][] num=new String[10][4];
	        num[0][0]=" _ ";
	        num[0][1]="| |";
	        num[0][2]="| |";
	        num[0][3]=" - ";

	        num[1][0]="  ";
	        num[1][1]=" |";
	        num[1][2]=" |";
	        num[1][3]="  ";

	        num[2][0]=" _ ";
	        num[2][1]=" _|";
	        num[2][2]="|_ ";
	        num[2][3]="   ";

	        num[3][0]=" _ ";
	        num[3][1]=" _|";
	        num[3][2]=" _|";
	        num[3][3]="   ";
	        
	        num[4][0]="   ";
	        num[4][1]="|_|";
	        num[4][2]="  |";
	        num[4][3]="   ";

	        num[5][0]="  _ ";
	        num[5][1]=" |_ ";
	        num[5][2]="  _|";
	        num[5][3]="    ";

	        num[6][0]=" _ ";
	        num[6][1]="|  ";
	        num[6][2]=" - ";
	        num[6][3]="|_|";
	        
	        
	        num[7][0]=" _ ";
	        num[7][1]="  |";
	        num[7][2]="  |";
	        num[7][3]="   ";
	       
	        num[8][0]=" _ ";
	        num[8][1]="|_|";
	        num[8][2]="|_|";
	        num[8][3]="   ";

	        num[9][0]=" _ ";
	        num[9][1]="|_|";
	        num[9][2]=" _|";
	        num[9][3]="   ";

	      
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

	
			
			
	


