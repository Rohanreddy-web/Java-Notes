public class RotateArray {
    public static void main(String[] args) {
        int rotateArray[]={1,6,2,4,8,9};
        int rotatel[];
        int rotater[];
        int x=2;
        //IF X >LENGTH OF ARRAY
        x=x%rotateArray.length;
        rotater=new int[rotateArray.length];
        rotatel=new int[rotateArray.length];
        //rotating left
       for (int i = 0; i < rotatel.length; i++) {
        rotatel[(i-x+rotatel.length)%rotatel.length]=rotateArray[i];
       }
       //rotate right
       for (int i = 0; i < rotater.length; i++) {
        rotater[(i+x)%rotater.length]=rotateArray[i];
       }
       System.out.println("rotate Left");
       for (int i : rotatel) {
        System.out.print(i+" ");
       }
       System.out.println();
       System.out.println("rotate Right");
       for (int i : rotater) {
        System.out.print(i+" ");
       }
   }
}
