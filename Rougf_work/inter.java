public class inter {
    public static void main(String[] args) {
        int a[]={1, 5 ,10 ,15 ,20, 25};
        int b[]={2, 4, 5, 9, 15};
        int sum=0;
        int index=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i]!=a[j]) {
                    sum+=b[i];
                }
                else{
                    sum+=b[i];
                    index=i;
                    break;
                }
                
            }
        }
    }
}
