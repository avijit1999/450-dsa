import java.util.Scanner;
public class sort_012{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        Solution.sort012(A,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
     }
}
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int l=0,m=0,h=n-1,t;
        while(m<=h)
        {
            switch(a[m])
            {
                case 0:t=a[l];
                        a[l]=a[m];
                        a[m]=t;
                        l++;
                        m++;
                        break;
                case 1:m++;
                        break;
                case 2:t=a[h];
                        a[h]=a[m];
                        a[m]=t;
                        h--;
                        break;
            }
        }
    }
}
