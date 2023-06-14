package average;

import java.util.Scanner;

public class Averagemarks {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter marks for five units
	        System.out.println("Enter the marks for five units:");

	        int totalMarks = 0;
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Unit " + i + ": ");
	            int marks = scanner.nextInt();
	            totalMarks += marks;
	        }

	        // Calculate the average
	        double average = (double) totalMarks / 5;

	        // Display the average with two decimal places
	        System.out.printf("Average marks: %.2f%n", average);

	        scanner.close();
	    }
	}
	


