//Q.1:Write a Program to generate a triangle or an inverted triangle till n terms based upon the user's choice of triangle to be displayed.
import java.io.*;//Importing Files from the pre-Installed JDK.
class Generate_Triangle_Exam_Question1//Assigning the class name as "Generate_Triangle".
{
    public static void main()throws IOException//Throws a Input-Output Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Initialising the BufferedReader br
        System.out.println("**********************************************************************************************************************************************************");
        System.out.println("Welcome,Dear User");//Text Output to welcome the user
        System.out.println("Please Select Your Option...");//Guides the user on how to choose the option.
        System.out.println("1 <---For An Erect Triangle ");//Guides user to Choose this incase he needs a Erect Triangle.
        System.out.println("2 <---For An Inverted Triangle ");//Guides user to choose this incase he wishes for a Inverted Triangle.
        System.out.println("**********************************************************************************************************************************************************");
        System.out.println("");
        int a=Integer.parseInt(br.readLine());//This code Stores the value (the choice of the user) entered by the User in 'int a' for further utilization.
        System.out.println("Great We have your choice now!");
        System.out.println("**********************************************************************************************************************************************************");
        System.out.println("To Move On\nPlease Enter The Number Of Rows You Would Like To Have ... ");
        int n=Integer.parseInt(br.readLine());//This code Stores the value (the number of rows) entered by the User in 'int n' for further utilization.
        System.out.println("**********************************************************************************************************************************************************");

        switch(a)//Switches the case as per to the users option.
        {
            case 1://it user chooses 'case 1' this operation takes place.
            for(int i=1;i<=n;i++)//this loop is run to Gaint the values of Rows
            {
                for(int j=1;j<=i;j++)//this loop is run to Gain the values of Columns

                    System.out.print("\t"+i);//This gives a text output which the user has asked for ,in this case it is an erect triangle. 
                System.out.println();//This leaves a line in order to create rows.

            }
            break;//breaks the statement of the 'case 1'.
            case 2://Switches the case as per to the users option.
            for(int i=n;i>=1;i--)//this loop is run to Gaint the values of Rows
            {
                for(int j=1;j<=i;j++)//this loop is run to Gain the values of Columns

                    System.out.print("\t"+i);//This gives a text output which the user has asked for ,in this case it is an Inverted triangle.
                System.out.println();//This leaves a line in order to create rows.

            }
            break;//breaks the statement of the 'case 1'.
            default://this statement sets a Default Value if the user has given a Incompatible input.
            System.out.println("");
            System.out.println("**********************************************************************************************************************************************************");
            System.out.println("Oops!\nAn Error has occured!\nTry again with a favourable number Later!");// The Default Statement set to guide the user.
            System.out.println("**********************************************************************************************************************************************************");
            System.out.println("");
            break;
        }

        System.out.println("");
        System.out.println("**********************************************************************************************************************************************************");
        System.out.println("Would you like to Try again with different options and rows?");//Guides the user on how to choose the option.
        System.out.println("If yes then type --> 1");//Guides user to Choose this incase he needs a Erect Triangle.
        System.out.println("If no then type --> 2");//Guides user to choose this incase he wishes for a Inverted Triangle.
        System.out.println("**********************************************************************************************************************************************************");
        System.out.println("");
        int k=Integer.parseInt(br.readLine());//This code Stores the value (the choice of the user) entered by the User in 'int k' for further utilization in swtiching the case.

        switch(k)//Switches the case as per to the users option.
        {
            case 1://it user chooses 'case 1' this operation takes place.
            {
                main();//This starts the main function again from the beginning.
            }
            break;//breaks the statement of the 'case 1'.

            case 2://it user chooses 'case 2' this operation takes place.
            {
                System.out.println("");
                System.out.println("**********************************************************************************************************************************************************");
                System.out.println("Thankyou For using my Program !");//This Prints the output if the user chooses to exit.
                System.out.println("Hope to see you again with more programs of ours!");//This Prints the output if the user chooses to exit.
                System.out.println("Program made by :\n***Rahul Anand***\n**Grade 10 Aravallis**");//This Prints the output if the user chooses to exit.
                System.out.println("**********************************************************************************************************************************************************");
                System.out.println("");
                System.exit(0);
            }
            break;//breaks the statement of the 'case 1'.
        }
    }
}
