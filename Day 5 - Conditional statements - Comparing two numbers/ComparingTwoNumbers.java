import java.util.Scanner;
public class ComparingTwoNumbers 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        float a= sc.nextFloat();
        System.out.println("Enter second no.");
        float b= sc.nextFloat();
        if(a>b)
        {
            System.out.print(a+" is greater than " +b);
        }
        else if(b>a)
        {
            System.out.print(b+" is greater than " +a);
        }
        else 
        {
            System.out.print(a+" is equal to " +b);
        }
    }
}
