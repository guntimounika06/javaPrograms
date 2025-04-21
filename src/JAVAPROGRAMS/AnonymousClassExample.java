package JAVAPROGRAMS;
interface  Grating
{
    void sayHello();
}
public class AnonymousClassExample 
{
    public static void main(String[] args)
    {
        Grating greet = new Grating()
        {
            @Override
            public void sayHello()
            {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        greet.sayHello();
        
    }
}
