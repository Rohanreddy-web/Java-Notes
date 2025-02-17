import java.util.Arrays;

public class sub {
public static void main(String[] args) {
    String str ="PQRS";
    String a="jcb";
    System.out.println(str.equals(a));
    for (int i = 0; i < str.length(); i++) {
        for (int k = i; k < str.length(); k++) {
           System.out.print(str.substring(i, k+1));
            System.out.println();
        }
      char ch='\0';
      ch='a';
      str.charAt(i);
      System.out.println(ch);
    }
    int arr[]={1,2,3,0};
    int arr2[]={1,3,2};
    Arrays.sort(arr);
    for (int i : arr) {
        System.out.print(i);
    }
System.out.println();
String x="a";
int c=0;
System.out.println(str.split(" "));
String b="abc";
int count =6;
b+=b.charAt(0)+count;
System.out.println(b);
}
}
