//Babbar
import java.util.Scanner;
public class Array8{

     public static void main(String []args){
        int n,x=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(A[i]<0)
            {
                int temp=A[i];
                A[i]=A[x];
                A[x]=temp;
                x++;
            }
        }
        System.out.print("The new Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
     }
}
