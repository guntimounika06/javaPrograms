package practice;

public class ThreadMethods extends Thread
{
    public static void main(String[] args)
    {
        ThreadMethods m = new ThreadMethods();
        System.out.println("Name = " + m.getName());
        m.setName("Mounika");
        System.out.println("Name = " + m.getName());
        System.out.println("Priority = " + m.getPriority());
        m.setPriority(7);
        System.out.println("Priority = " + m.getPriority());
        System.out.println("ThreadGroup: " + m.getThreadGroup());
        System.out.println("Interrupted " + m.isInterrupted());
        System.out.println("Daemon" + m.isDaemon());
        System.out.println("Alive " + m.isAlive());
    }
}
