public class countstring {
    public static void main(String[] args) {
        String str="An apple a day keeps the doctor away";
        // int count=0;
        // for (int i = 0; i < str.length(); i++) {
        //      if (str.charAt(i) ==' ') {
        //         count++;
        //      }
        // }
        // System.out.println(count+1);
       String arr[]=str.split(" ");
       System.out.println(arr.length);
       for (String string : arr) {
        System.out.println(string);
       }
    }
}
