package practice;
//When sub class object want to access its own method rather than accessing the method of super class
//It is an example of dynamic polymorphism
class riding
{
    public void car() {
        System.out.println("Fortuner");
    }
}
 public class MethodOveririding extends riding
 {
    public void car()
    {
        System.out.println("Benz");
    }
    public static void main(String[] args)
    {
        MethodOveririding m = new MethodOveririding();
        m.car();
    }
}
