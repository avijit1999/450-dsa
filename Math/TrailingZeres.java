import java.lang.Math;
import java.util.Scanner;
public class TrailingZeroes{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        int  z=1;
        n=sc.nextInt();
        z=trailingZeroes(n);
        System.out.println(z);
     }
     static int trailingZeroes(int x)
     {
         int r=0;
         for(int i=5;i<x;i*=5)
         {
             r=r+(int)Math.floor(x/i);
         }
         return(r);
     }
}
