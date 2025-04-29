package practice;
//It is a class contain only abstract methods
interface  Animals
        {
            void makeSound();
        }

        class Dogs implements Animals
        {
            public void makeSound()
            {
                System.out.println("Dog barks");
            }
        }

        class Cats implements Animals
        {
            public void makeSound()
            {
                System.out.print("Cat Cries");
            }
        }

public class InterfaceExample
{
    public static void main(String[] args)
    {
        Animals myDogs = new Dogs();
        Animals myCats = new Cats();

        myDogs.makeSound();
        myCats.makeSound();
    }
}
