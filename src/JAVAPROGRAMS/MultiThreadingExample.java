package JAVAPROGRAMS;
class MyTask implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class MultiThreadingExample
{
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new MyTask(), "Thread 1");
        Thread thread2 = new Thread(new MyTask(), "Thread 2");

        thread1.start();
        thread2.start();
    }
}
