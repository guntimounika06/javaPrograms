package practice;
//Instance variable will declared outside the method and inside the class...it can be accessed through object
public class InstanceVariable
{
    int a =10, b =10;
    int s = a + b;
    public static void main(String[] args)
    {
        InstanceVariable i =new InstanceVariable();
        System.out.println(i.s);
    }
}
