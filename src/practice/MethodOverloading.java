package practice;
//Same method name with different parameters is called methodoverloading. for static polymorphism
public class MethodOverloading
{
    public void solu()
    {
        System.out.println("Its a default constructor");
    }

    public void solu(int x)
    {
        System.out.println("Addition: "+ (x + x));
    }

    public void solu(float x, float y)
    {
        System.out.println("Multiplication: " + (x * y));
    }

    public void solu(int x, float y)
    {
       System.out.println("Subtraction: " + (x - y));
    }

    public static void main(String[] args)
    {
        MethodOverloading m = new MethodOverloading();
        m.solu();
        m.solu(10);
        m.solu(2.3f, 3.2f);
        m.solu(10,2.3f);
    }
}
