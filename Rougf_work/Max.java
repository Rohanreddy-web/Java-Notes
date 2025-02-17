import java.util.*;
public class Max {
    public static void main(String[] args) {
        int arr[]={12,43,19,56,74,10,3,18};
        int max1=Integer.MIN_VALUE;
        int max2=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max1 < arr[i]){
                max2=max1;//12,19,59
                max1=arr[i];//43,59,74
            }
            else if(max2< arr[i]){
                max2=arr[i];
            }
            }
            // max1=Math.min(max1, arr[i]);
            System.out.println(max1 + " " + "is max");
        System.out.println(max2 + " " + "is max2");
        String s1="rpjj";
        String s2="mdm";
        System.out.println(s1.concat(s2));
    }
        
    }


