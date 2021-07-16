//Bug in  static HashSet<Integer> intersect(int[] x,int[] y)

import java.util.*;
public class UnionIntersect{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] A=new int[m];
        for(int i=0;i<m;i++)
        {
            A[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] B=new int[n];
        for(int i=0;i<n;i++)
        {
            B[i]=sc.nextInt();
        }
        HashSet<Integer> Union=new HashSet<Integer>();
        Union=union(A,B);
        System.out.print(Union);
        HashSet<Integer> Intersect=new HashSet<Integer>();
        Intersect=intersect(A,B);
        System.out.print(Intersect);
     }
     static HashSet<Integer> union(int[] x,int[] y)
     {
        HashSet<Integer> A=new HashSet<Integer>();
        for(int i=0;i<x.length;i++)
        {
            A.add(x[i]);    
        }
        for(int i=0;i<y.length;i++)
        {
            A.add(y[i]);    
        }
        return(A);
     }
     static HashSet<Integer> intersect(int[] x,int[] y)
     {
        HashSet<Integer> A=new HashSet<Integer>();
        int j=0;
        for(int i=0;i<x.length;)
        {
            while(y[j]<x[i])
            {
                j++;
                if(j==y.length)
                {
                    return(A);
                }
            }
            while(y[j]>x[i])
            {
                i++;
                if(i==x.length)
                {
                    return(A);
                }
            }
            if(y[j]==x[i])
            {
                A.add(y[j]);
                j++;
                i++;
            }
        }
        return(A);
     }
}
