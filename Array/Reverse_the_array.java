//GFG
//Reverse a String

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String s="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            s+=Character.toString(ch);
        }
        return(s);
    }
}
