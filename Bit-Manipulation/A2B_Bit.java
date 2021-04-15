import java.util.Scanner;
public class A2B_Bit{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=0;
        int n=a^b;
        while(n>0)
        {
            n=n&(n-1);
            i++;
        }
        System.out.print(i);
     }
}
