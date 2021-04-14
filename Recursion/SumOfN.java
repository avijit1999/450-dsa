import java.util.Scanner;
public class SumOfN{

     public static void main(String []args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(SUM_OF_N(n));
     }
     static int SUM_OF_N(int x)
     {
         if(x==0){
            return(0);
         }
         return(x+SUM_OF_N(x-1));
     }
}
