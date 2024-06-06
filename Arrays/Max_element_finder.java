package Arrays;


public class Max_element_finder {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Call the method to find the maximum element
        int maxElement = findMax(numbers);

        // Print the maximum element
        System.out.println("The maximum element in the array is: " + maxElement);
    }

    /**
     * Method to find the maximum element in an array
     * @param array - input array of integers
     * @return the maximum element in the array
     */
    public static int findMax(int[] array) {
        // Initialize max to the first element of the array
        int max = array[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // Update max if the current element is greater than max
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Return the maximum element
        return max;
    }
}
