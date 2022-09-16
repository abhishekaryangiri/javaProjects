import java.io.*;
class Shop_Corrected
{
    String name,address;
    int type , amount;
    double discount , netamt;
    public static void main()throws IOException
    {
        Shop_Corrected Ob=new Shop_Corrected();
        Ob.input ();
        Ob. calc ();
        Ob. output ();
    }

    void input ()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(read);
        System.out.println(" ******************** ");
        System.out.println("Enter details");
        System.out.println(" Enter Name");
        name =stdin.readLine();
        System.out.println(" Enter Address");
        address = stdin.readLine();
        System.out.println("Enter amount of purchase");
        amount = Integer.parseInt(stdin.readLine());
        System.out.println("type of purchase");
        System.out.println("1---> Laptop");
        System.out.println(" 2--> Desktop");
        System.out.println("type:");
        type= Integer.parseInt(stdin.readLine());
    }

    void calc ()
    {
        switch(type)
        {
            case 1:
            if ( amount <25000)
            {
                discount = 0*amount;
                netamt = amount - discount;
            }
            if ( amount >2500 && amount >57000)
            {
                discount = 0.05*amount;
                netamt= amount - discount;
            }
            if(amount >57000 && amount < 100000)
            {
                discount = 0.075*amount;
                netamt = amount - discount;
            }
            if( amount >100000)
            {
                discount= 0.01*amount;
                netamt= amount- discount;
            }
            break;
            case 2:
            if ( amount <25000)
            {
                discount= 0.05*amount;
                netamt= amount- discount;
            }
            if( amount >25000 && amount<57000)
            {
                discount= 0.075*amount;
                netamt= amount - discount;
            }
            if(amount >57000 && amount<100000)
            {
                discount = 0.01*amount;
                netamt= amount - discount;
            }
            if(amount >100000)
            {
                discount = 0.015*amount;
                netamt= amount- discount;
            }
            break;
        }
    }

    void output()
    {
        System.out.println("***********************");
        System.out.println("Name " +name);
        System.out.println("Address " +address);
        System.out.println("Net Amount " +netamt);
        System.out.println("Thanks for purchasing .\nHope to see you again soon...\nShreshtha Dandnayak ");
    }
}