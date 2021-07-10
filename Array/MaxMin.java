import java.util.Scanner;
public class MaxMin{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int min=A[0],max=A[0];
        for(int i=0;i<n;i++)
        {
           if(min>A[i])
           {
               min=A[i];
           }
           if(max<A[i])
           {
               max=A[i];
           }
        }
        System.out.println("min="+min);
        System.out.println("max="+max);
     }
}
