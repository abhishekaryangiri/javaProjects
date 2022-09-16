class Sum_and_Average_using_array
{
    public static void main(int a,int b,int c,int d)
    {
        int ar[]={a,b,c,d};
        int i;
        int sum;
        sum=0;
        for(i=0;i<=4;i++)
        {
            sum=sum+ar[i];
        }  
        {
            System.out.println("The sum = "+sum);
            float avg=sum/ar.length;

            System.out.println("The average is= "+avg);
        }
    }
}
