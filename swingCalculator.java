import java.util.Scanner;
class Name
{
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the first value = ");
            float a=sc.nextFloat();

            System.out.print("Enter the second value = ");
            float b=sc.nextFloat();

            char ch;
            System.out.print("Enter the operator = ");
            Scanner operator=new Scanner(System.in);
            ch =operator.next().charAt(0);

            if(ch == '+')
            {
                System.out.println("Your answer is: " + (a+b));
            }
            if(ch == '-')
            {
                System.out.println("Your answer is: " + (a-b));
            }
            if(ch == '/')
            {
                System.out.println("Your answer is: " + (a/b));
            }
            if(ch == '*')
            {
                System.out.println("Your answer is: " + (a*b));
            }
        }
}

