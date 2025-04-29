package practice;
abstract class Animal
{
    abstract void makeSound();

    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog says: bow! bow!");
    }
}

class Cat extends Animal
{
    void makeSound()
    {
        System.out.println("Cat says: Meow!");
    }
}
public class AbstractClassExample
{
    public static void main(String[] args)
    {
        Animal DDog = new Dog();
        Animal CCat = new Cat();

        DDog.makeSound();
        DDog.sleep();

        CCat.makeSound();
        CCat.sleep();

    }

}
