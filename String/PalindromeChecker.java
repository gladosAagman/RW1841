package String;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = scanner.nextLine();

        // Check if the string is a palindrome using iterative method
        boolean isPalindromeIterative = isPalindromeIterative(inputString);
        System.out.println("Is the string a palindrome (Iterative): " + isPalindromeIterative);

        // Check if the string is a palindrome using StringBuilder method
        boolean isPalindromeStringBuilder = isPalindromeStringBuilder(inputString);
        System.out.println("Is the string a palindrome (StringBuilder): " + isPalindromeStringBuilder);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to check if a string is a palindrome using iterative approach
     * @param str - input string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeIterative(String str) {
        int left = 0, right = str.length() - 1;

        // Compare characters from both ends of the string until the middle is reached
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match
            }
            left++;
            right--;
        }

        return true; // All characters match
    }

    /**
     * Method to check if a string is a palindrome using StringBuilder
     * @param str - input string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeStringBuilder(String str) {
        // Reverse the string using StringBuilder
        String reversedString = new StringBuilder(str).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        return str.equals(reversedString);
    }
}
