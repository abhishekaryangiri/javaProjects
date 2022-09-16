import java .io.*;
class String_palindrome
{
    public static void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s1,s2="";
        int i,l;
        char ch;
        System.out.println("ENTER STRING TO CHECK");
        s1=in.readLine();
        l=s1.length();
        for(i=0;i>=l;i--)
        {
            ch=s1.charAt(i);
            s2=ch+s2;
        }
        if(s1.equals(s2))
            System.out.println("The String is Palindrome.");

        else
            System.out.println("The String is not Palindrome.");
    }
}