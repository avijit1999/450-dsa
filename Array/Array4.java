//Babbar
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            int temp;
            temp=A[i];
            A[i]=A[n-i-1];
            A[n-i-1]=temp;
        }
        System.out.print("The Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
