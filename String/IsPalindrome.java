import java.util.Scanner;
public class IsPalindrome{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        System.out.println(Solution.isPalindrome(S)==1);
     }
}
class Solution {
    static int isPalindrome(String S) {
        // code here
        for(int i=0;i<S.length()/2;i++)
        {
            if(S.charAt(i)!=S.charAt(S.length()-i-1))
            {
                return 0;
            }
        }
        return 1;
    }
};
