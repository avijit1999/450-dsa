import java.util.Scanner;
public class Rotate{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        Compute.rotate(A,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
     }
}
class Compute {
    
    static public void rotate(int arr[], int n)
    {
        int t=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=t;
    }
}
