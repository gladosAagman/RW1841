package String;


import java.util.Scanner;

public class RemoveLowercaseCharacters {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Remove all lowercase characters
        String resultString = removeLowercaseCharacters(inputString);

        // Print the resulting string
        System.out.println("String after removing lowercase characters: " + resultString);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to remove all lowercase characters from a string
     * @param str - input string
     * @return a new string with all lowercase characters removed
     */
    public static String removeLowercaseCharacters(String str) {
        // Create a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Iterate over the char array
        for (char c : charArray) {
            // Append only non-lowercase characters to the result
            if (!Character.isLowerCase(c)) {
                result.append(c);
            }
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }
}
