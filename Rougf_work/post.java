public class post {
    public static void main(String[] args) {
       int arr[]={1 ,3 ,6 ,2 ,5 ,4,3 ,2, 4 };
       int count=0;
       for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==x){
                    count++;
                }
        }

       }
       System.out.println(count);
    }
}
