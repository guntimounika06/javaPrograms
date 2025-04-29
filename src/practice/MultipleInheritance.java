package practice;
interface Cricket
{
    public abstract void ipl();
}
interface Sports
{
    public void season();
}
public class MultipleInheritance implements Cricket, Sports
{
    public void ipl()
    {
        System.out.println("Season 2025");
    }

    public void season()
    {
        System.out.println("In Hyderabad");
    }
    public static void main(String[] args)
    {
        MultipleInheritance m = new MultipleInheritance();
        m.ipl();
        m.season();

    }

}
