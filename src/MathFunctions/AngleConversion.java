package MathFunctions;
import java.util.Scanner;
public class AngleConversion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Convert Degrees to Radians
        System.out.print("Enter angle in degrees");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.println("Angle in radians: " + radians);

        //Convert Radians to Degrees
        System.out.print("Enter angle in radians: ");
        double inputRadians = scanner.nextDouble();
        double convertedDegrees = Math.toDegrees(inputRadians);
        System.out.println("Angle in degrees: " +convertedDegrees);

        scanner.close();
    }
}
