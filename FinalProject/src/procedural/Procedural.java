package procedural;

import java.util.*;
public class Procedural {
	
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int secretNumber;										//save the secret number
		int low;												//set the limits of the secret number
		int high;												//set a limit for the secret number		
		int mid;												//to act as the guess
		int tries = 0;												//number of tries that the program took to guess the number							//to  draw a scale											//the scale refrence
		int answer;											//to stop the loop
		low = 1;
		high = 10000;
		System.out.println("Please enter the secret number");
		secretNumber = scan1.nextInt();
	do{												//i need the loop to work for the first time without checking
		tries++;										//to increase the number of tries
		mid = (high + low)/2;							//to get a guess
		System.out.println("My guess is " + mid);					//show my guess
		System.out.println("1.if my guess was right\n 2.If the secret number is larger than" + mid +"\n3.If the secret number is smaller than" + mid);				//show the main menu of the game
		answer = scan1.nextInt();
	switch (answer){						//the main menu

			case 1 :							//the program guess was right and the program will exit
				System.out.println("I win the program shall exit");
					break;
			case 2 :							//the secret number is larger than the guess so we need to increase the lower limit so we can get a higher guess
				low = mid + 1;
					break;
			case 3 :							//the secret number is smaller than the guess and we need to lower the upper limit so we can get a lower guess
				high = mid - 1;
					break;
	default :{
		 System.out.println("wrong choice");
			break;}
	}
	}while (answer != 1);

		System.out.println("the guess is " + mid +" and the number of guesses is " + tries);	
		
		                         
	}

}
