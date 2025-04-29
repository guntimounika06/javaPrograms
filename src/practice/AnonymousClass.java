package practice;

interface Wishes
{
    void sayHello();
}
public class AnonymousClass
{
    public static void main(String[] args)
    {
        Wishes w = new Wishes() {
            @Override
            public void sayHello()
            {
                System.out.print("Hello from anonymous class implementing an interface");

            }
        };

        w.sayHello();
    }
}
