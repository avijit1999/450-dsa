import java.lang.Math;
import java.util.Scanner;
public class isPrimeNumber{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isPrime(n))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
     }
     static Boolean isPrime(int x)
     {
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                return(false);
            }
        }
        return(true);
     }
}
