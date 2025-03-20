package JAVAPROGRAMS;

abstract class Flowers
{
    abstract void makeFragrance();
}
public class AnonymousExample
{

    public static void main(String[] args)
    {
        Flowers rose = new Flowers()
        {
            void makeFragrance()
            {
                System.out.println("Good Fragrance");//TODO Auto-generated method stub
            }
        };
        rose.makeFragrance();
    }

}
