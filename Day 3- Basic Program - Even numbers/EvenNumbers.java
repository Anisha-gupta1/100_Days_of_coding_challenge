import java.util.Scanner;
public class EvenNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to be checked");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+ " is an even no.");
        }
        else
        {
            System.out.println(n+ " is an odd no.");
        }
    }
}
