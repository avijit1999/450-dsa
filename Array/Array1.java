//Love Babbar
import java.util.Scanner;
class  Array1{
    public static void main(String[] args) {
       int[] A=new int[10];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<10;i++)
       {
           A[i]=sc.nextInt();
       }
       System.out.print("The array is:");
       for(int i=0;i<10;i++)
       {
           System.out.print(A[i]+" ");
       }
    }
}
