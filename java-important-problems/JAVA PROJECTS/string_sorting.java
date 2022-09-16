
class string_sorting
{
    public static void main()
    {
        String a[]= {"Rahul","Vaishnavee","Aman","Akshat","Jack" };
        int i;
        int j;
        String t= " ";
        int l=a.length;
        for( i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(a[i].compareTo (a[j])>0)
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }
    }
}