//Babbar
import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
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
        System.out.print("Kth largest="+A[n-k]+" kth smallest="+A[k-1]);
    }
}
