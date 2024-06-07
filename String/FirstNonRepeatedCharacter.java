package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Find the first non-repeated character
        Character firstNonRepeatedChar = findFirstNonRepeatedCharacter(inputString);

        // Print the first non-repeated character
        if (firstNonRepeatedChar != null) {
            System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
        } else {
            System.out.println("There are no non-repeated characters in the string.");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to find the first non-repeated character in a string
     * @param str - input string
     * @return the first non-repeated character or null if none found
     */
    public static Character findFirstNonRepeatedCharacter(String str) {
        // Create a LinkedHashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Iterate over the string to populate the map
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Iterate over the map to find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return null if no non-repeated character is found
        return null;
    }
}
