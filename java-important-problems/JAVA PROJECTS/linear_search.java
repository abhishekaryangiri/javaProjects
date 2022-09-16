class linear_search
{
    public static void main(int n)
    {
        int a[]={1,2,3,4,5};
        int i;
        int flag=0;
        int l=a.length;
        for(i= 0;i<l;i++)
        {
            if( a[i]==n)
            {
                System.out.println("Integer found at "+(i+1));
                flag=1;
            }

            if (flag==0)
            {
                System.out.println("Not found,Please try again with a favourable number");
            }

        }
        System.out.println("Thankyou for using my Program!- Rahul A");
    }

}

