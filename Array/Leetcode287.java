//Find the Duplicate Number
import java.util.*;
public class Leeetcode287{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println(Solution.findDuplicate(A));
        
     }
}
class Solution{

    static public int findDuplicate(int[] nums) {
        HashSet<Integer> A=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(A.add(nums[i])==false)
            {
                return(nums[i]);
            }
        }
        return(-1);
    }
    
}
