import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;
public class SieveOfErotosthenes{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        ArrayList<Integer> A=new ArrayList<Integer>();
        A=SOE(n);
        for(int i=0;i<A.size();i++)
        {
            System.out.print(A.get(i)+" ");
        }
     }
     static ArrayList<Integer> SOE(int x)
     {
        ArrayList<Integer> A=new ArrayList<Integer>();
        Boolean[] B=new Boolean[x];
        for(int i=0;i<x;i++)
        {
            B[i]=true;
        }
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(B[i]==false)
            {
                continue;
            }
            for(int j=i*2;j<x;j+=i)
            {
                B[j]=false;
            }
        }
        for(int i=1;i<x;i++)
        {
            if(B[i]==true)
            {
                A.add(i);
            }
        }
        return(A);
     }
}
