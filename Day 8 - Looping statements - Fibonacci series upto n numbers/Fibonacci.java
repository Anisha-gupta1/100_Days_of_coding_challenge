import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        int n, a=0, b=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of numbers to be printed in Fibonacci series:");
        n= sc.nextInt();
        System.out.println("The Fibonnaci series of "+n+" terms is:");
        for(int i=1; i<=n; i++)
        {
            System.out.print(a+",");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
