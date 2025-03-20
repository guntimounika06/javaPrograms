package MathFunctions;
import java.util.Scanner;
//scanner class is used to read input from the user
public class SquareRoot
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if(number < 0)
        {
            System.out.println("Square root of a negative number is not a real number.");
        }
        else {
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + "is: " + squareRoot);
        }

        scanner.close();
    }
}
