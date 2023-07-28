
public class BubbleSortingDescend {
public static void main(String[] args) {
	 int a[]={22,30,40,5,1};
     int t,i,j,k,l;

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