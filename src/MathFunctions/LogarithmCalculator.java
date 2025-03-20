package MathFunctions;
import java.util.Scanner;
public class LogarithmCalculator
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double number = scanner.nextDouble();

        if(number <= 0)
        {
            System.out.println("Logarithm is undefined for non-positive numbers.");

        }
        else {
            double naturalLog = Math.log(number);
            double base10Log = Math.log10(number);

            System.out.println("Natural log(ln) of " + number + " = " + naturalLog);
            System.out.println("Base-10 log(log10) of " + number + " = " + base10Log);
        }

        scanner.close();
    }
}
