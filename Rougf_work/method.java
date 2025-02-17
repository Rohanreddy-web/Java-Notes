public class method {
    public static float add(float a ,float b){
      
        return a+b+1.0f;
    }
    public static double add(double a ,double b){
        return a+b;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int b[]=arr1;
        b[2]=60;
        System.out.println(arr1);
        System.out.println(b);
        System.out.println(arr1[2]);
        for (int i : b) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        float a[];
        a=new float[8];
        System.out.println(a);
    }
}
