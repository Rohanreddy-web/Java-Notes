

public class far {
    public static void main(String[] args) {
        int start=36;
        int end=618;
        int step=78;
        for(int i=start;i<end;i+=step){
            int c=(i-32)*5/9;
            System.err.println(i+" "+c);
        }
    }
}
