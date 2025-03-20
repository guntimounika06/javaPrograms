package MathFunctions;

public class MinMax
{
   public static void findMaxMin(int a, int b)
   {
       int max = Math.max(a, b);
       int min = Math.min(a, b);

       System.out.println("Maximum: " + max);
       System.out.println("Minimum: " + min);
   }

   public static void main(String[] args)
   {
       int num1 = 25, num2 = 40;
       findMaxMin(num1, num2);
   }
}
