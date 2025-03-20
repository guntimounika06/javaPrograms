package MathFunctions;
import java.util.Scanner;
public class TrigonometryCalculator
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an angle in radians: ");
    double radians = scanner.nextDouble();

    //compute trigonometric values
    double sineValue = Math.sin(radians);
    double cosineValue = Math.cos(radians);
    double tangentValue = Math.tan(radians);


    System.out.println("sin(" + radians + ") = " + sineValue);
    System.out.println("cos(" + radians + ") = " + cosineValue);
    System.out.println("tan(" + radians + ") = " + tangentValue);

    scanner.close();

   }
}