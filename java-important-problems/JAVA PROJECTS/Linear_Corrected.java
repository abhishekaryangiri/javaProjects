class Linear_Corrected
{
    void main(int n)
    {
        int a[]={1,2,6,8,7,9,10};
        int i;
        int flag=0;
        int l;
        l=a.length;
        {
            for(i=0;i<l;i++)
            {
                if(i==n)
                    System.out.println("The number is found at " +(i+1));
                {
                    if(flag==0)
                        System.out.println("Try another number");
                }
            }
        }
    }
}