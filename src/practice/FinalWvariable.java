package practice;
//Final with Variable cannot be reassigned once intialized
public class FinalWvariable
{
    public static void main(String[] args)
    {
        int x = 100;
        final int y = 30;
        System.out.println(x);
        System.out.println(y);
        x = 500;
        //y = 40;
        System.out.println(x);
        System.out.println(y);
    }
}
