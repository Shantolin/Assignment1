//This program asks the user to enter a number.
//it then checks if the user's number is divisible by the current number.
package divisibility;

import java.util.Scanner;

public class DisibilityTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility by integers in the range 0-9
        for (int divisor = 0; divisor <= 9; divisor++) {
            if (number % (divisor + 1) == 0) {
                System.out.println("The number is divisible by " + divisor);
            }
        }

        scanner.close();
    }
}

