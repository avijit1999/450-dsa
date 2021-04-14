import java.util.Scanner;
public class GCD{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=gcd(a,b);
        System.out.println(g);
     }
     static int gcd(int x,int y)
     {
        if(y==0)
        {
            return(x);
        }
        else{
            return(gcd(y,x%y));
        }
     }
}
