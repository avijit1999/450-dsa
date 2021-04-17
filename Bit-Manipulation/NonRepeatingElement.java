import java.util.Scanner;
public class NonRepeatingElement{

     public static void main(String []args){
         int ans=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            ans=ans^A[i];
        }
        System.out.print(ans);
     }
}
