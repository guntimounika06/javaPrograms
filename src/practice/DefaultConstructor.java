package practice;
//Constructor is the birth place of an object, It has the same name as a class name , method name has no return type
public class DefaultConstructor
{
    float a;
    int b;
    boolean c;
    String d;
    public DefaultConstructor()
    {
        System.out.println("It is a default constructor");
    }
    public static void main(String[] args)
    {
        DefaultConstructor d =new DefaultConstructor();
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
        System.out.println(d.d);
    }
}
