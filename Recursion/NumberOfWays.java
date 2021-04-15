import java.util.Scanner;
public class NumberOfWays{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ans=count(m,n);
        System.out.print(ans);
     }
     static int count(int x,int y)
     {
        if((x==1)||(y==1))
        {
            return(1);
        }
        return(count(x,y-1)+count(x-1,y));
     }
}
