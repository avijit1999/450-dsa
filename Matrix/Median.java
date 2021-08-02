import java.util.*;
public class Median{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] A=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.print(Solution.median(A,m,n));
     }
}

class Solution {
    public static int median(int matrix[][], int r, int c) {
        // code here   
        int[] A=new int [r*c];
        int x=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                A[x++]=matrix[i][j];
            }
        }
        Arrays.sort(A);
        return(A[(r*c)/2]);
    }
}
