package JAVAPROGRAMS;
class Teach
{
    String message = "Hello from Teacher";

    void display()
    {
        System.out.println("Teacher class method");
    }
}

class Students extends Teach
{
    String message = "Hello from Student";

    void display()
    {
        super.display();
        System.out.println(super.message);
    }
}
public class SuperKeyword {

    public static void main(String[] args)
    {
        Students obj = new Students();
        obj.display();// TODO Auto-generated method stub

    }

}

