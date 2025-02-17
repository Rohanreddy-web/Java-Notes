public class Solution {  

    public static int findUnique(int[] arr) {
        // Your code goes here
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Initialize count to 0
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++; // Count occurrences of arr[i]
                }
            }
            if (count == 1) { // If arr[i] appears only once, return it
                return arr[i];
            }
        }
        return 0; // Return 0 if no unique element is found
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 5, 1, 3, 4, 7, 4, 8, 8};
        System.out.println(findUnique(arr)); // Output will be 7
        int c=10;
        String v="ro";
        String x="";
        x=x +v.charAt(1)+c;
        System.out.println(x);
    }
}
