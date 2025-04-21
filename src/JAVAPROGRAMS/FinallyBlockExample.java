package JAVAPROGRAMS;

public class FinallyBlockExample
{
    public static void main(String[] args)
    {
        try
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); //Throws ArrayIndexOutofBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds!");
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
