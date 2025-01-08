package Java;

import java.util.Scanner;

public class ReverseNUMBER {

	public static void main(String[] args) {
    
		// Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize a variable to store the reversed number
        int reversedNumber = 0;
        
        // Reverse the number using a while loop
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            
            // Append the digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;
            
            // Remove the last digit from the original number
            number /= 10;
        }
        
        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
        
        // Close the scanner object
        scanner.close();
	}

}
