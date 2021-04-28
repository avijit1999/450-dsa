//Babbar
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        int n,max,min;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        max=A[0];
        min=A[0];
        for(int i=1;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        System.out.print("Max="+max+" Min="+min);
    }
}
