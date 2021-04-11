import java.util.Scanner;
public class factorial{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        long f=1;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
     }
}
