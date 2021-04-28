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
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i]>A[j])
                {
                    int temp;
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.print("The Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
