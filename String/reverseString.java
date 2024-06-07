package String;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to reverse:");
        String inputString = scanner.nextLine();

        // Reverse the string using iterative method
        String reversedStringIterative = reverseStringIterative(inputString);
        System.out.println("Reversed string (Iterative): " + reversedStringIterative);

        // Reverse the string using StringBuilder method
        String reversedStringBuilder = reverseStringBuilder(inputString);
        System.out.println("Reversed string (StringBuilder): " + reversedStringBuilder);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to reverse a string using iterative approach
     * @param str - input string
     * @return the reversed string
     */
    public static String reverseStringIterative(String str) {
        // Convert the input string to a character array
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        // Swap characters from both ends of the array until the middle is reached
        while (left < right) {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            // Move the pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string and return
        return new String(charArray);
    }

    /**
     * Method to reverse a string using StringBuilder
     * @param str - input string
     * @return the reversed string
     */
    public static String reverseStringBuilder(String str) {
        // Use StringBuilder's reverse method to reverse the string
        return new StringBuilder(str).reverse().toString();
    }
}