package practice;
//Accessible from anywhere in the project
public class PublicKeyword
{
    public void show()
    {
        System.out.println("This is a public method");
    }

    public static void main(String[] args)
    {
        PublicKeyword p = new PublicKeyword();
        p.show();
    }

}
