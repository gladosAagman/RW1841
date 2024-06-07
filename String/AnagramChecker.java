package String;


import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Check if the two strings are anagrams
        boolean areAnagrams = areAnagrams(firstString, secondString);
        System.out.println("Are the two strings anagrams? " + areAnagrams);

        // Close the scanner
        scanner.close();
    }

    /**
     * Method to check if two strings are anagrams
     * @param str1 - first input string
     * @param str2 - second input string
     * @return true if the strings are anagrams, false otherwise
     */
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespaces and convert strings to lower case
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different, if so they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

