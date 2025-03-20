package MathFunctions;

public class PowerCalculator
{
    public static double computePower(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args)
    {
        double base = 2.0;
        double exponent = 5.0;

        double result = computePower(base, exponent);

        System.out.println(base + "raised to the power of " + exponent + " is: " + result);
    }
}
