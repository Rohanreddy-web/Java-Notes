public class stringfr {
    public static void main(String[] args) {
        int arr[]=new int[256];
        String out="aabbccdsa";
        char ch='\0';
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < out.length(); i++) {
            arr[out.charAt(i)]+=1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (max< arr[i]) {
                max=arr[i];
                ch= (char)i;
            }
        }
       System.out.println(ch);
    }

}
