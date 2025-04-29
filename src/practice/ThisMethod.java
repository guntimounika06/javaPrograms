package practice;
//this() Method is used to call one constructor from another constructor
public class ThisMethod
{
    public ThisMethod()
    {
        System.out.println("Default Constructor");
    }

    public ThisMethod(int x)
    {
        this(20,30);
        System.out.println("result: " +(x+x));
    }

    public ThisMethod(int x, int y)
    {
        this();
        System.out.println("result: " + (x*y));
    }

    public static void main(String[] args)
    {
        ThisMethod t = new ThisMethod(10);
    }
}
