//Babbar
import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        n=sc.nextInt();
        int[] A=new int[n-1];
        for(i=0;i<n-1;i++)
        {
            A[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
           sum+=A[i];
        }
        System.out.print("The missing element is:"+((n*(n+1)/2)-sum));
     }
}
