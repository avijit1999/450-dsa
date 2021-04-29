//Babbar
import java.io.*;
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        n=sc.nextInt();
        int[] A=new int[n];
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        ans=duplicates(A,n);
        System.out.print("The duplicate numbers are:");
        for(int val:ans)
        {
            if(val==-1)
            {
                 System.out.print("NILL");
                 break;
            }
            System.out.print(val+" ");
        }
     }
     static ArrayList<Integer> duplicates(int arr[], int n)
    {
        ArrayList<Integer> A=new ArrayList<Integer>();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            a[arr[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>1)
            {
                A.add(i);
            }
        }
        if(A.size()>0)
        {
            return(A);
        }
        A.add(-1);
        return(A);
    }
}
