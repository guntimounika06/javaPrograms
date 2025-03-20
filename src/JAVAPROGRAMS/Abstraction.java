package JAVAPROGRAMS;
abstract class Vehicle
{
    abstract void start();

    void stop()
    {

        System.out.println("Vehicle is stopping...");
    }

}

class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car starts with a key");
    }
}
public class Abstraction
{

    public static void main(String[] args)
    {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();// TODO Auto-generated method stub

    }

}



