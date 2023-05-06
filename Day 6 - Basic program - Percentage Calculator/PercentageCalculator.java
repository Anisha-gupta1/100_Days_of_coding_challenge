import java.util.Scanner;
public class PercentageCalculator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in best 5 subjects");
        System.out.println("Enter marks obtained in 1st subject");
        float s1 =sc.nextFloat();
        System.out.println("Enter max. marks in 1st subject");
        float m1 = sc.nextFloat();
        System.out.println("Enter marks obtained in 2nd subject");
        float s2 =sc.nextFloat();
        System.out.println("Enter max. marks in 2nd subject");
        float m2 =sc.nextFloat();
        System.out.println("Enter marks obtained in 3rd subject");
        float s3 =sc.nextFloat();
        System.out.println("Enter max. marks in 3rd subject");
        float m3 =sc.nextFloat();
        System.out.println("Enter marks obtained in 4th subject");
        float s4 =sc.nextFloat();
        System.out.println("Enter max. marks in 4th subject");
        float m4 =sc.nextFloat();
        System.out.println("Enter marks obtained in 5th subject");
        float s5 =sc.nextFloat();
        System.out.println("Enter max. marks in 1st subject");
        float m5 =sc.nextFloat();

        float total_marks_obtained = s1+s2+s3+s4+s5;
        float total_marks = m1+m2+m3+m4+m5;
        float per = (total_marks_obtained/total_marks)*100;
        System.out.println("Your percentage is: " +per);
    } 
}
