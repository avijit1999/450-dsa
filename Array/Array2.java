// Babbar
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int n,m,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(A[i]==m)
            {
                System.out.print("True");
                k=1;
            }
        }
        if(k==0)
        {
            System.out.print("False");
        }
    }
}
