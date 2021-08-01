//Find the factorial of large number
import java.util.*;
public class chocolateDistributionProblem{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        ArrayList<Long> A=new ArrayList<Long>();
        for(long i=0;i<n;i++){
            A.add(sc.nextLong());
        }
        Long m=sc.nextLong();
        long ans=Solution.findMinDiff(A,n,m);
       System.out.println(ans);
     }
}
class Solution
{
    static public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long s=a.get((int)m-1)-a.get(0);
        for(int i=0;i<n;)
        {
           if(i+(int)m-1>=n)
           {
               break;
           }
           if(a.get(i+(int)m-1)-a.get(i)<s)
           {
               s=a.get(i+(int)m-1)-a.get(i);
           }
           i++;
        }
        return(s);
    }
}
