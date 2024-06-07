package String;

import java.util.Scanner;

public class CountCaseCharacters {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Count the number of lowercase and uppercase characters
        int[] caseCounts = countCaseCharacters(inputString);

        // Print the counts
        System.out.println("Number of lowercase characters: " + caseCounts[0]);
        System.out.println("Number of uppercase characters: " + caseCounts[1]);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to count the number of lowercase and uppercase characters in a string
     * @param str - input string
     * @return an array where the first element is the count of lowercase characters and the second element is the count of uppercase characters
     */
    public static int[] countCaseCharacters(String str) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Iterate over the char array
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                // If the character is lowercase, increment the lowercase count
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                // If the character is uppercase, increment the uppercase count
                uppercaseCount++;
            }
        }

        return new int[]{lowercaseCount, uppercaseCount};
    }
}
