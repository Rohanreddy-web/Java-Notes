public class prifx {
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int p[]=new int[arr.length];
    p[0]=arr[0];
    for (int i = 1; i <p.length; i++) {
        p[i]=p[i-1]+arr[i];
    }
   for (int i = 0; i < p.length; i++) {
    System.out.print(p[i]+" ");
   }
}
}