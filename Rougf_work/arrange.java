public class arrange {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int index=0;
        int a[]=new int[arr.length];
        for (int i = 0; i < a.length; i++) {
            if(arr[i]%2!=0){
                a[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(arr[i]%2==0){
                a[index]=arr[i];
                index++;
            }
        }
        for (int j : a) {
            System.out.print(j+" ");
        }

    }
}
