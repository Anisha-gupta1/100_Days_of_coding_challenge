import java.util.Scanner;
public class KiloToMile 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in kilometers");
        float l1 = sc.nextFloat();
        float m= 1.609f;
        float mile = l1/m;
        System.out.println(l1+" kilometers = "+mile+" miles");
    }
}
