package Final;


import java.util.Scanner;



public class Calc1 {

		public static void main(String[] args) {
			Scanner scan1 = new Scanner(System.in);
			// binary number
			System.out.println("Please enter the binary number : ");
		    long num = scan1.nextLong();

		    // call function and giving the binary number
		    int decimal = convertBinaryToDecimal(num);
		    System.out.println("Number in decimal is  = " + decimal);
		    // calling function converter to turn the value into a string
		    int loop = decimal;
		    int length = 0;
		    
		    while(loop != 0) {
		    	loop = loop / 10;
		    	length++;
		    }
		    
		    int[] num1 = converter(decimal, length);
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
		static int[] converter(int num, int length) {
			int number[] = new int[length];
			
			
			for(int i = length -1; i >= 0; i--) {

				number[i] = num % 10;
				num /= 10;
			}
			
			return number;
		}
			    
		//this function will take  the array and print it out in the digital format	    
		static void degitalFormat(int[] number) {    
				
			String [][] num=new String[10][4];
	       

			
	      
	        for (int col = 0; col < 3; col++)
	        {          
	            for (int row=0; row < number.length; row++)
	            {
	              int value = number[row];
	              
	              
	              
	    			if( value == 2 || value == 3 || value == 5 || value == 0|| value == 6 || value == 7 || value == 8 || value == 9) {
	    				
	    				num[0][0]=" _ ";
	    				
	    			}else {
	    				num[0][0] = "   ";
	    			}
	    			
	    			
	    			
	    			
	    			if(value == 2 || value == 3) {
	    				num[1][0]= " _|";
	    			}else if(value == 4 || value == 8 || value == 9) {
	    				num[1][0] = "|_|";
	    			}else if(value == 5 || value == 6) {
	    				num[1][0]="|_ ";
	    			}else if (value == 1 || value == 7) {
	    				num[1][0] = "  |";
	    			}else if (value == 0) {
	    				num[1][0] = "| |";
	    			}
	    			
	    			
	    			if (value == 1 || value == 4 || value == 7 || value == 9) {
	    				num[2][0] = "  |";
	    			}else if(value == 3 || value == 5) {
	    				num[2][0] = " _|";
	    			}else if (value == 0 ||value == 6 || value == 8) {
	    				num[2][0] = "|_|";
	    			}else if (value == 2) {
	    				num[2][0]="|_ ";
	    			}
	    			
	    			
	    			
	    			
	                System.out.print(num[col][0]);
	                System.out.print("  ");
	            }          
	            System.out.println();
	        }
	    }
	}
		/*this loop will represent the columns and the inner one will represent the row and the row in the matrix will represent the number that is wanted to print
		 the loop will print the first column of each number then move to the second column and then keep doing this until the whole number is printed
		 */
	
			
			
	


