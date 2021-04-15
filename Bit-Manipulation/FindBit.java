import java.util.Scanner;
public class FindBit{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        if((n&(1<<(i-1)))==0)
        {
            System.out.print("Zero");
        }
        else{
            System.out.print("One");
        }
     }
}
