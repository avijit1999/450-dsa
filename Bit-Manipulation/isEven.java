import java.util.Scanner;
public class isEven{

     public static void main(String []args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println((a&1)==0);
     }
}
