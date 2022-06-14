package Final;

import java.util.Scanner;



public class Calculator {

		public static void main(String[] args) {
			Scanner scan1 = new Scanner(System.in);
			// binary number
			System.out.println("Please enter the binary number : ");
		    long num = scan1.nextLong();

		    // call function and giving the binary number
		    int decimal = convertBinaryToDecimal(num);
		    System.out.println("Number in decimal is  = " + decimal);
		    // calling function converter to turn the value into a string
		    int[] num1 = converter(decimal);
		    //call function for printing the number out in a digital format
		    degitalFormat(num1);
		    
		  }
			//convert the number to decimal
		  public static int convertBinaryToDecimal(long num) {
		    int decimalNumber = 0, i = 0;
		    long remainder;
		    //the binary number will be modules by 10 so the first number in the right is taken then multiplied by the 2 to the power of loop counter which represent the place of the binary number
		    while (num != 0) {
		      remainder = num % 10;
		      num /= 10;
		      decimalNumber += remainder * power(i);
		      i++;
		    }
		    
		    return decimalNumber;
		  }
		  //function that takes the loop counter which represent the place of the number taken
		  public static int power(int position) {
				int result = 1;
				for (int i = 0; i < position; ++i) {
					result *= 2;
				}
				// System.out.println(result);
				return result;
			
		  }
		
		//this function will convert the data type long to array of integers
		static int[] converter(long num) {
			String str = Long.toString(num);
			int arrLen = str.length();
			int number[] = new int[arrLen];
			
			for(int i =0; i < arrLen; i++) {

				number[i] = (int) str.charAt(i) - '0';
				
			}
			
			return number;
		}
			    
		//this function will take  the array and print it out in the digital format	    
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
	        num[6][1]="|_ ";
	        num[6][2]="|_|";
	        num[6][3]="   ";
	        
	        
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

	      
	        for (int col = 0; col < 4; col++)
	        {          
	            for (int row=0; row < number.length; row++)
	            {
	                int value = number[row];
	                System.out.print(num[value][col]);
	                System.out.print("  ");
	            }          
	            System.out.println();
	        }
	    }
	}
		/*this loop will represent the columns and the inner one will represent the row and the row in the matrix will represent the number that is wanted to print
		 the loop will print the first column of each number then move to the second column and then keep doing this until the whole number is printed
		 */
	
			
			
	


