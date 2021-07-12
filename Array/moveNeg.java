import java.util.Scanner;
public class moveNeg{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        Solution.move_Neg(A,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
     }
}
class Solution
{
    static void move_Neg(int[] A, int n)
    {
        int j=0,t;
        for(int i=0;i<n;i++)
        {
            if(A[i]<0){
                if(i!=j)
                    {
                        t=A[i];
                        A[i]=A[j];
                        A[j]=t;
                    }
                j++;
            }
        }
    }
}
