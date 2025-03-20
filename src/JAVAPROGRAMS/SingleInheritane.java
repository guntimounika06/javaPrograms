package JAVAPROGRAMS;
class Anima
{
    void eat()
    {
        System.out.println("This animal eats food");
    }
}

class Dogg extends Anima
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

public class SingleInheritane {

    public static void main(String[] args) {
        Dogg d = new Dogg();
        d.eat();
        d.bark();
        // TODO Auto-generated method stub

    }

}


