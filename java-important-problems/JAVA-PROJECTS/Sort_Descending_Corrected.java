class Sort_Descending_Corrected
{
    public static void main()
    {
        int a[]={2,65,48,71};
        int i;
        int j;
        int t;
        int l = a.length;
        for(i=0;i<l-1;i++)
        {
            for( j=i+l;j<l;j++)
            {
                if(a[i]<a[j])
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