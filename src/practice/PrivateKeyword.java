package practice;
//Accessible only within the same class
//Not visible to same classes, even sub classes
class A
{

    private int data = 40;


        private void msg()
        {
            System.out.println("Hello from private method");
        }

        public void show()
        {
            System.out.println(data);
        }

}
public class PrivateKeyword
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
        //obj.msg();
    }
}
