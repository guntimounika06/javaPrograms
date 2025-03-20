package JAVAPROGRAMS;
interface Pets
{
    void makeSound();
}

class Cat implements Pets
{
    public void makeSound()
    {
        System.out.println("Dog barks");
    }
}


public class AbstractionUsingInterface
{

    public static void main(String[] args)
    {
        Pets myDog = new Cat();
        myDog.makeSound();// TODO Auto-generated method stub

    }

}
