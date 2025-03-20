package MathFunctions;
import java.util.Scanner;
public class AbsoluteDifference
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double difference = Math.abs(num1 - num2);

        System.out.println("The absolute difference is: " + difference);

        scanner.close();
    }
}
