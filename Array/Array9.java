//Babbar
import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        int n,m=0,i=0,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] A=new int[n];
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        m=sc.nextInt();
        int[] B=new int[m];
        for(i=0;i<m;i++)
        {
            B[i]=sc.nextInt();
        }
        int[] C=new int[n+m];
        for(i=0;i<n;)
        {
            if(j==m)
                {
                    break;
                }
            if(A[i]==B[j])
            {
                C[k]=A[i];
                j++;
                k++;
                i++;
            }
            else if(A[i]<B[j]){
                C[k]=A[i];
                k++;
                i++;
            }
            else{
                C[k]=B[j];
                k++;
                j++;
            }
        }
        while(j<m)
        {
            C[k]=B[j];
            k++;
            j++;
        }
        while(i<n)
        {
            C[k]=A[i];
            k++;
            i++;
        }
        System.out.print("The union of two Arrays is:");
        for(i=0;i<k;i++)
        {
            System.out.print(C[i]+" ");
        }
        int o=(n>m)?m:n;
        int[] D=new int[o];
        k=0;
        j=0;
        for(i=0;i<n;)
        {
            if(j==m)
            {
                break;
            }
            if(A[i]==B[j])
            {
                D[k]=A[i];
                k++;
                j++;
                i++;
            }
            else if(A[i]<B[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
        System.out.print("\nThe intersection of two Arrays is:");
        for(i=0;i<k;i++)
        {
            System.out.print(D[i]+" ");
        }
     }
}
