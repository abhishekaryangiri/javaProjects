import java.io.*;
public class String_vowel
{
    public static void main()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        char ch;
        char chr=0;
        String s1;
        String S3=" ";
        int i;
        int j;
        int c=0;
        int s2 =0;
        System.out.println("Enter string 1");
        s1=br.readLine();
        i=s1.length();
        for(j=0;j<i;j++)
        {
            ch=s1.charAt(j);
            if(ch=='A')
            {
                s2=s2+1; 
            }
            if(ch=='E')
            {
                s2=s2+1; 
            }
            if(ch=='I')
            {
                s2=s2+1; 
            }
            if(ch=='O')
            {
                s2=s2+1; 
            }
            if(ch=='U')
            {
                s2=s2+1; 
            }
            if(ch=='a')
            {
                s2=s2+1; 
            }
            if(ch=='e')
            {
                s2=s2+1; 
            }
            if(ch=='i')
            {
                s2=s2+1; 
            }
            if(ch=='o')
            {
                s2=s2+1; 
            }
            if(ch=='u')
            {
                s2=s2+1; 
            }
        }
        System.out.println("The number of Characters Are : "+i);
        System.out.println("The number of Vowels are "+s2);
    }
}