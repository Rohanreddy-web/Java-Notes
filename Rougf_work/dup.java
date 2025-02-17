public class dup {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 3 ,20 };
        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }

            }
            if (count==2) {
                System.out.println(array[i]);
                break;
                
            }

        }
       
    }
}
