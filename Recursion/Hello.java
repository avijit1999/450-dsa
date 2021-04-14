import java.util.Scanner;
public class Hello{

     public static void main(String []args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        hello(n);
     }
     static void hello(int x)
     {
         if(x!=0){
            System.out.println("Hello");
            hello(x-1);
         }
         return;
     }
}
