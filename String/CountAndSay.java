import java.util.Scanner;

public class CountAndSay{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Solution.countAndSay(n));
    }
}
class Solution {
    public static  String countAndSay(int n) {
        String A="";
        if(n==1)
        {
            A="1";
        }
        else{
            String s=countAndSay(n-1);
            int c=1;
            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    c++;
                }
                else{
                    A=A+c+s.charAt(i);
                    c=1;
                }
            }
             A=A+c+s.charAt(s.length()-1);
        }
        return A;
    }
}
