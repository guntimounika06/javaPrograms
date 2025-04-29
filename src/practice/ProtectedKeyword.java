package practice;
//Accessible within the same package and by subclasses
class Parent
{
    protected void habits()
    {
        System.out.println("Protected method");
    }
}
public class ProtectedKeyword extends Parent
{
    public static void main(String[] args)
    {
        ProtectedKeyword p = new ProtectedKeyword();
        p.habits();
    }

}
