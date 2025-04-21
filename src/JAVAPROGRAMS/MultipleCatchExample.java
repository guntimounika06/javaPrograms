package JAVAPROGRAMS;

public class MultipleCatchExample
{
    public static void main(String[] args)
    {
        try
        {
            int[] arr = new int[3];
            arr[5] = 10;
            int x = 100 / 0;
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array error: " + e);
        } catch(ArithmeticException e)
        {
            System.out.println("Math error: " + e);
        }


    }
}
