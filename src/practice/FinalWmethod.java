package practice;
//A method which is written Final cannont be overreadable
class Ml
{
    public final void name()
    {
        System.out.println("Machine Learning");
    }

    public void color()
    {
        System.out.println("Red");
    }
}
public class FinalWmethod extends Ml
{
    public void color()
    {
        System.out.println("Blue");
    }
    public static void main(String[] args)
    {
        FinalWmethod f = new FinalWmethod();
        f.name();
        f.color();
    }

}
