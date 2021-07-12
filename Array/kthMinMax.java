import java.util.*;

public class kthMaxMin{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(A);
        System.out.println("kth min="+A[k-1]);
        System.out.println("kth max="+A[n-k]);
     }
}
