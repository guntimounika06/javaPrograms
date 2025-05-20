package practice;
class First extends Thread
{
    public void run()
    {
        try
        {
            int i;
            for(i = 1; i <= 5; i++)
            {
                System.out.println("Value= " + i);
                Thread.sleep(10000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class Second extends Thread
{
    public void run()
    {
        try
        {
            int i;
            for(i = 5; i >= 1; i--)
            {
                System.out.println("Value= " + i);
                Thread.sleep(10000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class MultipleThreads
{
    public static void main(String[] args)
    {
        First f = new First();
        f.start();
        Second s = new Second();
        s.start();
    }
}
