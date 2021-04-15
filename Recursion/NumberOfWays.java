import java.util.Scanner;
public class NumberOfWays{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ans=f(m,n);
        System.out.print(ans);
     }
     static int f(int x,int y)
     {
        if((x==1)||(y==1))
        {
            return(1);
        }
        return(f(x,y-1)+f(x-1,y));
     }
}
