import java.io.*;
class Triangle_Corrected
{
    public static void main()throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        System.out.println("1----> Erect triangle");
        System.out.println("2----> Inverted Triangle");
        int num= Integer.parseInt(stdin.readLine());
        System.out.println("Enter the number of rows you want in the triangle");
        int n= Integer.parseInt(stdin.readLine());
        switch(num)
        {
            case 1:
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)

                    System.out.print(i);
                System.out.println();

            }
            break;
            case 2:
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=i;j++)

                    System.out.print(j);
                System.out.println();
            }

            break;
            default :
            System.out.println("Oops,An error has occured,please try again later");
        }
    }
}