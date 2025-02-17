public class Reverse {
    public static void Reverse(int arr[], int mid) {
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 ,6};
        int mid = (array[0] + array[array.length - 1]) / 2;
        Reverse(array, mid);
    }
}
