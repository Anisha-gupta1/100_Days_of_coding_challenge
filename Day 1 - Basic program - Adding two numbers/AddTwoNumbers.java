
import java.util.Scanner;
public class AddTwoNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Enter the first no.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second no.");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is: " +sum);

    }
}
