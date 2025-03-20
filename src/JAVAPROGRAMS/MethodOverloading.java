package JAVAPROGRAMS;
class MathOperations
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    double add(double a, double b)
    {
        return a + b;
    }
}

public class MethodOverloading {

    public static void main(String[] args)
    {
        MathOperations math =  new MathOperations();

        System.out.println("sum of the two integers: " + math.add(5,  10));
        System.out.println("sum of the three integers: " + math.add(5,  10, 15));
        System.out.println("sum of two doubles: " + math.add(5.5, 2.5));// TODO Auto-generated method stub

    }

}

