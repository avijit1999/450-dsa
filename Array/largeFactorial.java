import java.util.*;
public class largeFactorial{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println(Solution.maxProfit(A));
        
     }
}
class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> A=new ArrayList<Integer>();
        for(int i=1;i<=N;i++)
        {
            if(i==1)
            {
                A.add(1);
            }
            else{
                int c=0;
                for(int j=0;j<A.size();j++)
                {
                    int x=A.get(j)*i+c;
                    c=x/10;
                    A.set(j,(x%10));
                }
                if(c!=0)
                {
                    if(c<=9){
                    A.add(c);
                    }
                    else{
                        while(c>10)
                        {
                            A.add(c%10);
                            c/=10;
                        }
                        A.add(c);
                    }
                }
            }
        }
         Collections.reverse(A);
        return(A);
    }
}
