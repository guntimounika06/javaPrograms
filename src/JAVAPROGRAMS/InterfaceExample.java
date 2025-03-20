package JAVAPROGRAMS;
interface Animalss
{
    void makeSound();
}

class Dogss implements Animalss
{
    public void makeSound()
    {
        System.out.println("Dog Barks");
    }
}
public class InterfaceExample
{

    public static void main(String[] args)
    {
        Dogss myDog = new Dogss();
        myDog.makeSound();// TODO Auto-generated method stub

    }

}

