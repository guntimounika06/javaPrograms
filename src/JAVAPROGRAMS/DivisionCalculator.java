package JAVAPROGRAMS;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DivisionCalculator
{
    public static void main(String[] args)
    {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            //performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input ! please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } finally {
            System.out.println("Program ended.");
        }
    }

}
