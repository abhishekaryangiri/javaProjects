class bubble_sorting_descend
{
    public static void main()
    {
        int a[]={22,30,40,5,1};
        int t;
        int i;
        int j;
        int l;
        l=a.length;
        for(j=0;j<l-1;j++)
        {
            for(i=j+1;i<l;i++)
            {
                if(a[j]<a[i])
                {
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        for(j=0;j<l;j++)
        {
            System.out.println(a[j]);
        }
    }
}

