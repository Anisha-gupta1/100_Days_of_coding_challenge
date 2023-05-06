import java.util.Scanner;
public class PrimeNumbers 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int count=0;
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        
        if(count==1)
        {
            System.out.println(n+" is a prime no.");
    
        }
        else
        {
            System.out.println(n+ " is not a prime no.");
        }

    }
    
}
