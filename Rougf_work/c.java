public class c {
    public static void main(String[] args) {
        String a="abc de ghihjk a uvw h j";
        int min=Integer.MAX_VALUE;
        String x="";
        String arr[]=a.split(" ");
        for (int i = 0; i < arr.length; i++) {
            min=Math.min(min, arr[i].length());
            x=arr[i];
        }
        System.out.println(x);
    }
}
