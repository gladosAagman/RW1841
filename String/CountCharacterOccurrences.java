package String;

import java.util.Scanner;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the character to be counted
        System.out.println("Enter the character to count:");
        char characterToCount = scanner.next().charAt(0);

        // Call the method to count the occurrences of the character
        int count = countOccurrences(inputString, characterToCount);

        // Print the result
        System.out.println("The character '" + characterToCount + "' appears " + count + " times in the string.");

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to count the occurrences of a specific character in a string
     * @param str - input string
     * @param ch - character to count
     * @return the number of occurrences of the character in the string
     */
    public static int countOccurrences(String str, char ch) {
        int count = 0;

        // Iterate through the string and count the occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // Return the count
        return count;
    }
}
