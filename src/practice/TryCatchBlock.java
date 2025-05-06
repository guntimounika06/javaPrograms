package practice;

public class TryCatchBlock
{
    public static void main(String[] args)
    {
        int a = 10, b = 5;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Program executed successfully");

        }
    }
}
