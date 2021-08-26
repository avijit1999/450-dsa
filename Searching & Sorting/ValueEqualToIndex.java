import java.util.*;
import java.io.*;
public class ValueEqualToIndex{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        ArrayList<Integer> AL=new ArrayList<Integer>();
        AL=Solution.valueEqualToIndex(A,n);
        for(int i=0;i<AL.size();i++)
        {
            System.out.print(AL.get(i)+" ");
        }
     }
}
class Solution
{
    public static ArrayList<Integer> valueEqualToIndex(int a[], int n)
    {
        // code here 
        ArrayList<Integer> A=new ArrayList<Integer>();
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]==i+1)
	        {
	            A.add(i+1);
	        }
	    }
	    return(A);
    }
}
