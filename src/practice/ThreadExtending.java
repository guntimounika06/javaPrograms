package practice;

public class ThreadExtending extends Thread
{
    public void run()
    {
        try
        {
            int i;
            for(i = 1; i <= 10; i++)
            {
                System.out.println("Value = " + i);
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        ThreadExtending t = new ThreadExtending();
        t.start();
    }
}
