import java.util.Scanner;
public class Reverse_the_array{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            int t=A[i];
            A[i]=A[n-i-1];
            A[n-i-1]=t;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
     }
}
