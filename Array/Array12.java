//Babbar
import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,i,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] A=new int[n];
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int count=getPairsCount(A,n,k);
        System.out.print("The number of pair  is:"+ count);
     }
     static int getPairsCount(int[] arr, int n, int k)
     {
         int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    count++;
                }
            }
        }
        return count;
     }
}
