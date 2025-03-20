package MathFunctions;
import java.util.Scanner;
public class RoundingExample
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        long rounded = Math.round(number);
        double floored = Math.floor(number);
        double ceiled = Math.ceil(number);

        System.out.println("Original number: " + number);
        System.out.println("Math.round(): " + rounded);
        System.out.println("Math.floor(): " + floored);
        System.out.println("Math.ceil(): " + ceiled);

        scanner.close();
    }



}
