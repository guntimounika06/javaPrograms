package JAVAPROGRAMS;
interface Greeting
{
    void sayHello(String name);
}

public class LambdaExample
{

    public static void main(String[] args)
    {
        Greeting greet = (name) -> System.out.println("Hello, " + name);// TODO Auto-generated method stub
        greet.sayHello("Mounika");
    }

}

