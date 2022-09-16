import java.io.*;
public class change_case
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch;
        char chr=0;
        String s1;
        String s2=" ";
        int i;
        int j;
        int c=0;
        System.out.println("Enter string 1");
        s1=br.readLine();
        i=s1.length();
        for(j=0;j<i;j++)
        {
            ch=s1.charAt(j);
            if(Character.isUpperCase(ch))
            {
                chr=Character.toLowerCase(ch);
                s2=s2+chr;
            }
            if(Character.isLowerCase(ch))
            {
                chr=Character.toUpperCase(ch);
                s2=s2+chr;
            }
            if(ch==' ')
                s2=s2+" ";
        }
        System.out.print(s2);
    }
}