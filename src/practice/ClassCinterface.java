package practice;

import java.util.concurrent.Callable;

class Fruits
{
    interface Types
    {
        void colors();
    }
}
public class ClassCinterface implements Fruits.Types
{
    public void colors()
    {
        System.out.println("All colors fruits");
    }
    public static void main(String[] args)
    {
     ClassCinterface c = new ClassCinterface();
     c.colors();
    }
}
