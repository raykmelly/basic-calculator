package com.pluralsight;

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        // Create scanner to get input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to give 2 different numbers + store them
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        // New line to add a space
        System.out.println();

        // Give options to the user to complete actions
        System.out.println("Possible Calculations:");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");

        // Fix the scanner by refreshing it
        scanner.nextLine();

        // Get the user's choice to prompt
        System.out.println("Enter your choice letter: ");
        String choice = scanner.nextLine();

        int answer = 0;
        if (choice.equalsIgnoreCase("A")) {
            // Chose to add (num1 + num2)
            answer = num1 + num2;
        } else if (choice.equalsIgnoreCase("S")) {
            // Chose to subtract (num1 - num2)
            answer = num1 - num2;
        } else if (choice.equalsIgnoreCase("M")) {
            // Chose to multiply (num1 * num2)
            answer = num1 * num2;
        } else if (choice.equalsIgnoreCase("D")) {
            // Chose to divide (num1 / num2)
            answer = num1 / num2;
        } else {
            // Unknown selection letter, throw an error and retry
            System.out.println("Error, invalid choice given. Please retry.");
        }

        // Print out the answer to the calculation
        System.out.printf("Answer: %d",answer);
    }
}
