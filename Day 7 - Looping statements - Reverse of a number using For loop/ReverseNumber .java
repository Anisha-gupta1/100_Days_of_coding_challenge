import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reversed:");
        int n = sc.nextInt();
        int rev=0; int l=0; 
        for(;n!=0;n=n/10)
        {
            l=n%10;
            rev = rev*10+l;
        
        }
        
        System.out.println(l);
        System.out.println(n);
        System.out.println(rev+ " is the reverse of your number ");

    }
}
