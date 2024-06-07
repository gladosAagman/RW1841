package String;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to remove duplicates:");
        String inputString = scanner.nextLine();

        // Remove duplicates while maintaining order
        String resultWithOrder = removeDuplicatesWithOrder(inputString);
        System.out.println("String after removing duplicates (Maintaining order): " + resultWithOrder);

        // Remove duplicates without maintaining order
        String resultWithoutOrder = removeDuplicatesWithoutOrder(inputString);
        System.out.println("String after removing duplicates (Without maintaining order): " + resultWithoutOrder);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to remove duplicates while maintaining order using LinkedHashSet
     * @param str - input string
     * @return the string after removing duplicates
     */
    public static String removeDuplicatesWithOrder(String str) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        // Add each character to the LinkedHashSet, which maintains insertion order
        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    /**
     * Method to remove duplicates without maintaining order using HashSet
     * @param str - input string
     * @return the string after removing duplicates
     */
    public static String removeDuplicatesWithoutOrder(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        // Add each character to the HashSet, which does not maintain order
        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
