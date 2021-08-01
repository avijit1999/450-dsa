//Find the factorial of large number
import java.util.*;
public class largeFactorial{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> A=new ArrayList<Integer>();
        A=Solution.factorial(n);
       for(int i=0;i<A.size();i++)
       {
           System.out.print(A.get(i));
       }
        
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
