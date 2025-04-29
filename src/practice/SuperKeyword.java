package practice;
//It is used to call the super class constructor from the sub class constructor
class Superr
{
    public void location()
    {
        System.out.println("Hyderabad");
    }
}
public class SuperKeyword extends Superr
{
    public void location()
    {
        super.location();
        System.out.println("Begumpet");
    }

    public static void main(String[] args)
    {
        SuperKeyword s = new SuperKeyword();
        s.location();
    }
}
