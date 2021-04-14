import java.util.Scanner;
public class Power{

     public static void main(String []args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(power(a,b));
     }
     static int power(int x,int y)
     {
         if(y==0){
            return(1);
         }
         return(x*power(x,y-1));
     }
}
