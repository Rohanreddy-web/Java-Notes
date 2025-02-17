import java.lang.Math;
public class sumArray {
    public static void main(String[] args) {
        int a[] = { 9, 7, 6, 6 };
        int b[] = { 9, 5, 7 };
        int total[] = new int[Math.max(a.length, b.length) + 1];
        int i = a.length - 1;
        int j = b.length - 1;
        int k = total.length - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = a[i] + b[j] + carry;
            total[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        // System.out.println(j);
            while (i >= 0) {
                int sum = a[i] + carry;
                total[k] = sum % 10;
                carry = sum / 10;
                i--;
                k--;
            }
       
            while (j >= 0) {
                int sum = b[j] + carry;
                total[k] = sum % 10;
                carry = sum / 10;
                j--;
                k--;
            }
    
        total[k] = carry;
        for (int l : total) {
            System.out.print(l + " ");
        }

    }
}
