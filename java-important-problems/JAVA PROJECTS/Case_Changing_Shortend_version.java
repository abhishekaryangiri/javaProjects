import java.util.*;
class Case_Changing_Shortend_version
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word/line");
        String a=sc.nextLine();
        String s="";
        char b, chr;
        chr=0;
        int i, l;
        l=a.length();
        for (i=0; i<l; i++)
        {
            b=a.charAt(i);
            if (b>='A' && b<='Z')
            {
                chr=Character.toLowerCase(b);
                s=s+chr;
            }
            if (b>='a' && b<='z')
            {
                chr=Character.toUpperCase(b);
                s=s+chr;
            }
            if (b==' ')
            {
                s=s+" ";
            }
        }
        System.out.println(s);
        
    }
}