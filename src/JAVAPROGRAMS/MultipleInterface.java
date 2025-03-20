package JAVAPROGRAMS;
interface Animall
{
    void makeSound();
}

interface Pet
{
    void play();
}

class Rat implements Animall, Pet
{
    public void makeSound()
    {
        System.out.println("Rat Bites");
    }

    public void play()
    {
        System.out.println("Rat is running");
    }
}
public class MultipleInterface
{

    public static void main(String[] args)
    {
        Rat myRat = new Rat();
        myRat.makeSound();
        myRat.play();// TODO Auto-generated method stub

    }

}


