import java.util.Scanner;
public class ResetBit{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.print((n&~(1<<(i-1))));
     }
}
