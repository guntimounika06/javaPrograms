package JAVAPROGRAMS;
class Examples
{
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;


    void display()
    {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);


    }
}

public class AccessModifier {




    public static void main(String[] args)
    {
        Examples obj = new Examples();
        obj.display();

        //System.out.println(obj.privateVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
        // TODO Auto-generated method stub

    }

}

