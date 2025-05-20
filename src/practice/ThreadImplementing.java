package practice;

public class ThreadImplementing implements Runnable
{
    public void run()
    {
        try
        {
            int i;
            for(i = 1; i <= 10; i++)
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
    public static void main(String[] args)
    {
        ThreadImplementing tt = new ThreadImplementing();
        Thread t = new Thread(tt);
        t.start();
    }

}
