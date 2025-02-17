public class AscendingSubarrayMax {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40,50};
        int maxSum = 0;
        int currentSum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentSum += array[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = array[i];
            }
        }

        maxSum = Math.max(maxSum, currentSum); // Ensure last sequence is checked
        System.out.println("Maximum sum of ascending subarray: " + maxSum);
    }
}

