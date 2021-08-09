import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        Solution.reverseString(ch);
        String reverse=String.valueOf(ch);
        System.out.println(reverse);
    }
}

class Solution {
    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++)
        {
            char t=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=t;
        }
    }
}
