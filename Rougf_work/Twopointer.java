public class Twopointer {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        int l = 0;
        int r = arr.length - 1;
        int c1 = 0;
        int c2 = 0;
        int a=Integer.MIN_VALUE;
        
        while (l < r) { 
            if (arr[l] == 1) {
                c1++;
            }
            if (arr[r] == 1) {
                c2++;
            }
            l++;
            r--;
        }

        
        if (l == r && arr[l] == 1) {
            c1++; 
        }

        // Calculate the max count
        int max = Math.max(c1, c2);
        System.out.println(max);
    }
}
