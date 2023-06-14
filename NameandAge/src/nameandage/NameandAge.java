// This program asks the user to enter their surname and age.
// It then calculates the number of characters in the user's surname and checks if their age is even or odd.
// Finally, it prints the results to the console.

package nameandage;

import java.util.Scanner;

public class NameandAge {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user.
		 Scanner scanner = new Scanner(System.in);

		 //Ask user to enter their surname
	        System.out.println("Enter your surname: ");
	        
	     // Read the user's input and store it in a variable.
	        String surname = scanner.nextLine();

	        //Ask user to enter their age 
	        System.out.println("Enter your age: ");
	        
	     // Read the user's input and store it in a variable.
	        int age = scanner.nextInt();

	        //Calculate the number of characters in the surname
	         int numberOfCharacters = surname.length();
	         
	        //Check whether the user's age is even or odd
	         boolean isAgeEven = age % 2 == 0;
	         
	         // Print the number of characters in the user's surname.
	        System.out.println("The number of characters in your surname is " + numberOfCharacters);
	        
	        //Print whether the user's age is even or odd.
	        if (isAgeEven) {
	            System.out.println("Your current age is an even number");
	        } else {
	            System.out.println("Your current age is an odd number");
	        }

	
	}

}