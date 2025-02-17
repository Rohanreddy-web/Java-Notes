public class Pushz {
    public static int[] move(int array[]) {
        int non0 = 0;
        int zero;
        for (zero = 0; zero < array.length; zero++) {
            if (array[zero] !=0) {
                int temp = array[non0];
                array[non0] = array[zero];
                array[zero] = temp;
                non0++;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 0, 0, 2, 3 };
        for (int i : move(array)) {
            System.out.print(i + " ");
        }

    }

}
