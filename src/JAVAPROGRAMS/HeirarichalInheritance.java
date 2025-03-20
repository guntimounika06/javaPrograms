package JAVAPROGRAMS;
class Animals
{
    void eat()
    {
        System.out.println("this animal will eat");
    }
}

class Mamals extends Animals
{
    void walk()
    {
        System.out.println("mamal can walk");
    }
}

class Dogs extends Animals
{
    void bark()
    {
        System.out.println("dog can bark");
    }
}



public class HeirarichalInheritance {

    public static void main(String[] args)
    {
        Mamals m = new Mamals();
        m.eat();
        m.walk();

        Dog d = new Dog();
        d.eat();
        d.bark();// TODO Auto-generated method stub

    }

}


