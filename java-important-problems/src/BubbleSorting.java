
public class BubbleSorting {
public static void main(String[] args) {
	int a[]={22,30,40,5,1};
    int t, i, j,l;
	/*
	 * int i; int j; int l;
	 */
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
