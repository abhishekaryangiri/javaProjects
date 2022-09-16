class palindrome_Armstrong
{
    public static void main(int n)
    {
        int r;
        int s=0;
        int x=n;
        {
            while (n>0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
            }                
            if (s==x)
                System.out.println(x+" is a palindrome");
            else
                System.out.println(x+" is not a palindrome");
        }
        {
            while(n>0)
            {
                r=n%10;
                s=s+(r*r*r);
                n=n/10;
            }
            if (s==x)
                System.out.println(s+ " is an Armstrong no." );
            else
                System.out.println(s+ " is not an Armstorng no.");
        }
    }
}
 