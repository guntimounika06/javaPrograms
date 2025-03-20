package JAVAPROGRAMS;

class Example
{
    int instanceVar = 10;
    static int staticVar = 20;

    void instanceMethod()
    {
        System.out.println("Instance Method");
    }

    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

public class InstanceStatic {

    public static void main(String[] args)
    {
        System.out.println(Example.staticVar);
        Example.staticMethod();

        Example obj = new Example();
        System.out.println(obj.instanceVar);
        obj.instanceMethod();// TODO Auto-generated method stub

    }

}
