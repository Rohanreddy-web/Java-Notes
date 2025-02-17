public class Revers {
    public static void reverse(int array[], int L, int R) {
        while (L < R) {
            int temp = array[L];
            array[L] = array[R];
            array[R] = temp;
            L++;
            R--;
        }
        
    }

    public static void main(String[] args) {
        int array[] = { 1,2,3,4 };
        int x = 2;
        // STEP1
        reverse(array, 0, array.length - 1);
        // STEP 2
        reverse(array, 0, x-1);
        // STEP 3
         reverse (array,x, array.length-1);
        for (int i : array) {
            System.out.print(i + " ");
        }
      
}
}