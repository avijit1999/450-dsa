import java.util.Scanner;
public class Search{

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
        int searchElement=sc.nextInt();
        System.out.print(Solution.searchMatrix(A,searchElement));
     }
}

class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][matrix[i].length-1]<target)
            {
                continue;
            }
            if(matrix[i][0]>target)
            {
                break;
            }
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
