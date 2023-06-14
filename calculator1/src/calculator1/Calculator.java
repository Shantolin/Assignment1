//This program asks user to put in a number and an operation then prints out the result
package calculator1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        double firstNumber = scanner.nextDouble();

	        // Prompt the user to enter an operation
	        System.out.print("Enter an operation (+, -, *, /): ");
	        String operation = scanner.next();

	        // Prompt the user to enter another number
	        System.out.print("Enter another number: ");
	        double secondNumber = scanner.nextDouble();

	        // Perform the operation and display the result
	        double result;

	        switch (operation) {
	            case "+":
	                result = firstNumber + secondNumber;
	                System.out.println("Result: " + result);
	                break;
	            case "-":
	                result = firstNumber - secondNumber;
	                System.out.println("Result: " + result);
	                break;
	            case "*":
	                result = firstNumber * secondNumber;
	                System.out.println("Result: " + result);
	                break;
	            case "/":
	                if (secondNumber != 0) {
	                    result = firstNumber / secondNumber;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Cannot divide by zero!");
	                }
	                break;
	            default:
	                System.out.println("Invalid operation!");
	        }

	        scanner.close();
	    }
	}

	


