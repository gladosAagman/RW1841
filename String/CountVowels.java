package String;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Count the number of vowels
        int vowelCount = countVowels(inputString);

        // Print the count of vowels
        System.out.println("Number of vowels in the string: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to count the number of vowels in a string
     * @param str - input string
     * @return the count of vowels in the input string
     */
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Iterate over the char array
        for (char c : charArray) {
            // Check if the character is a vowel
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Method to check if a character is a vowel
     * @param c - input character
     * @return true if the character is a vowel, false otherwise
     */
    public static boolean isVowel(char c) {
        // Check for both lowercase and uppercase vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
