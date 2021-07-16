import java.util.Scanner;
public class Kadane'sAlgo{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println(Solution.maxSubarraySum(A,n));
        
     }
}
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    static int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int currSum=0,maxSum=0,max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        if(max<0)
        {
            return(max);
        }
        for(int i=0;i<n;i++)
        {
            currSum+=arr[i];
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
            if(currSum<0)
            {
                currSum=0;
            }
        }
        return(maxSum);
    }
    
}
