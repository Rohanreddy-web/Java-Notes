public class update {
    public static void main(String[] args) {
        int array[]={20,30,40,60,40};
        int search=40;
        int i=0;
        int update=80;
        for (int j : array) {
            System.out.print(j+" ");
        }
        while (i<array.length) {
            if (array[i]==search) {
                array[i]=update;
                break;
            }
            i++;
        }
        System.out.println();
        for (int j : array) {
            System.out.print(j+" ");
        }
    }
}
