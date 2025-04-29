package practice;
//An abstract method does not contain implementation part and ends with semicolumn
//An abstract class contain abstract methods and non abstract methods
//The sub class has to extend all the abstract methods of super class otherwise it is compilation error
abstract class Fan
{
    public abstract void model();
    public void caption()
    {
        System.out.println("New Fans");
    }
}
public class AbstractMethod extends Fan
{
    public void model()
    {
        System.out.println("2025");
    }

    public static void main(String[] args)
    {
        AbstractMethod a = new AbstractMethod();
        a.model();
        a.caption();
    }
}
