package practice;

public class Addition
{
    public void sum(int x, int y)
    {
        System.out.println("Sum of 2 numbers: " + (x+y));
    }

    public static void main(String[] args)
    {
        Addition a = new Addition();
        a.sum(10,20);
    }
}
