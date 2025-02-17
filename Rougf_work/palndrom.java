public class palndrom {
    public static void main(String[] args) {
        String nam="mom";
        String st2=new String(nam.toLowerCase().replaceAll("[^a-z0-9]", ""));
        nam=st2;
        int l=0;
        int r=nam.length()-1;
        int count=1;
        while (l<r) {
           char t1=nam.charAt(l);
           char t2= nam.charAt(r);
           if (t1==t2) {
            count++;
           }
           else if(t1!=t2){
            count=0;
           }
           l++;
           r--;
        }
        if (count==0) {
            System.out.println("no p");
        }
        else{
            System.out.println("p");
        }


    }
}
