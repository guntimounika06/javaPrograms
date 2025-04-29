package practice;

public class Operators
{
    public static void main(String[] args)
    {
        int a = 10 , b = 5;

        //Arithmetic Operators
        System.out.println("\nArithmetic Operators: ");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Division: " + (a/b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Modulus: " + (a % b)); //gives remainder

        //Relational Operators
        System.out.println("\nRelational Operators: ");
        System.out.println("Equals to: " + (a == b));
        System.out.println("Not Equals to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a<b));
        System.out.println("GEqual to: " + (a >= b));
        System.out.println("LEqual to: " + (a <=b));

        //logical operators
        System.out.println("\nLogical Operators:");
        System.out.println("AND: (a>5) && (b<10) : " + ((a > 5) && (b < 10)));
        System.out.println("OR: (a>5) || (b<10): " + ((a>5) || (b<10)));
        System.out.println("NOT !(a==b): " + !(a==b));

        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));  // AND
        System.out.println("a | b: " + (a | b));  // OR
        System.out.println("a ^ b: " + (a ^ b));  // XOR
        System.out.println("~a: " + (~a));        // NOT
        System.out.println("a << 1: " + (a << 1)); // Left shift
        System.out.println("a >> 1: " + (a >> 1)); // Right shift
    }
}
