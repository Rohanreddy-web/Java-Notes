import java.util.Scanner;

public class Insert {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the length of Array");
    int length=sc.nextInt();
    System.out.println("Enter the insert index");
    int index=sc.nextInt();
    System.out.println("Enter the element to insert");
    int element=sc.nextInt();
    System.out.println("Enter the size of array");
    int size=sc.nextInt(); 
    if (size>length) {
      return;
    }
    int array[]=new int[length];
    for (int i = 0; i < size; i++) {
        array[i]=sc.nextInt();
       
    }
    for (int i = size+1; i >=index; i--) {
       array[i]=array[i-1];
    }
    array[index]=element;
    size++;
   for (int i = 0; i < size; i++) {
    System.out.print(array[i]+" ");
   }
  sc.close();
}
}
