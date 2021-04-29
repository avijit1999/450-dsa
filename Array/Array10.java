//Babbar
import java.util.Scanner;
public class Array10{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,i,temp;
        n=sc.nextInt();
        int[] A=new int[n];
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        temp=A[n-1];
        for(i=n-2;i>=0;i--)
        {
            A[i+1]=A[i];
        }
        A[0]=temp;
        System.out.print("The New Array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
     }
}
