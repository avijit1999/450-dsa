import java.lang.Math;
import java.util.Scanner;
public class PalindromeNumber{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isPalindrome(n))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
     }
     static Boolean isPalindrome(int x)
     {
         int r=0;
         int p=x;
         while(x>0)
         {
            int i=x%10;
            x=x/10;
            r=r*10+i;
         }
         return(p==r);
     }
}
