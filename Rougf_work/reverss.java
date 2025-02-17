public class reverss {

    public static void main(String[] args) {
        String data="LET US CODE";
        String rev="";
        String ar[]=data.split(" ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = ar[i].length()-1; j>=0;j--) {
                rev=rev+ar[i].charAt(j);
            }
            rev=rev+"  ";
        }
        // System.out.print((char)('a'+4));
    }
}