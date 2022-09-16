class Bubble_sorting_Corrected
{
    public static void main()
    {
        int a[]={56,89,74,19,20};
        int t;
        int i;
        int j;
        int l;
        l=a.length;
        for(i=0;i<l-1;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(a[i]>a[j])
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