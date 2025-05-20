package practice;
class Inheritance
{
    public void car()
    {
        System.out.println("Brand is Fortuner");
    }
}
public class SingleInheritance extends Inheritance {
    public void color() {
        System.out.println("Color is Red");
    }

    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        s.car();
        s.color();
    }
}
