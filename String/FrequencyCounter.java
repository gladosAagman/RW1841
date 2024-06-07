package String;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Count the frequency of each character
        Map<Character, Integer> frequencyMap = countCharacterFrequency(inputString);

        // Print the frequency of each character
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to count the frequency of each character in a string
     * @param str - input string
     * @return a map containing the frequency of each character
     */
    public static Map<Character, Integer> countCharacterFrequency(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Iterate over the char array
        for (char c : charArray) {
            // If the character is already in the map, increment its count
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                // Otherwise, add the character to the map with a count of 1
                frequencyMap.put(c, 1);
            }
        }

        return frequencyMap;
    }
}
