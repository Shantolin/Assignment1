//This program gives out the multiples of 2,3 and 7
package multiplesof237;

import java.util.Scanner;

public class MultiplesOf237 {

	public static void main(String[] args) {
		 // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the range.
        System.out.println("Enter the range: ");

        // Read the user's input and store it in two variables.
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Loop through the numbers from the start to the end.
        for (int i = start; i <= end; i++) {
            // Check if the number is divisible by 2, 3, and 7.
            if (i % 2 == 0 && i % 3 == 0 && i % 7 == 0) {
                // Print the number if it is divisible by 2, 3, and 7.
                System.out.println(i);
            }
        }
    }
}

	
