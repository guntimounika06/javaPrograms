package MathFunctions;

public class RandomNumber
{
    public static void main(String[] args)
    {
        double randomValue = Math.random();

        int scaledValue = 1 + (int)(randomValue * 99);

        System.out.println("Random Number ( 1 to 100): " + scaledValue);
    }
}
