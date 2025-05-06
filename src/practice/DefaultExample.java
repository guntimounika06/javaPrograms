package practice;
//Accessible only within the same package
class Example
{
    void show()
    {
        System.out.println("Default access method");
    }
}
public class DefaultExample
{
    public static void main(String[] args)
    {
        Example e = new Example();
        e.show();
    }
}

