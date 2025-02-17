public class substring {
    public static void main(String[] args) {
        int n[]={1,1,1};
        int k1=2;
        int count=0;
        for (int i = 0; i < n.length; i++) { 
            for (int j = i + 1; j <= n.length ;j++) {  
                for (int k = i; k < j; k++) {
                    if(n[i]+n[k]==k1){
                        count++;
                    }
                    // System.out.print(n[k]);
                }
                System.out.println();  
            }
        }
        System.out.println(count);
    }
}
