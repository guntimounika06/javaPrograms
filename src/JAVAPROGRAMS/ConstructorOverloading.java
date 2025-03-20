package JAVAPROGRAMS;
class Teachers
{
    String name;
    int age;

    Teachers()
    {
        name = "UnKnown";
        age = 0;
    }

    Teachers(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name : " + name + ", Age: " + age);

    }
}
public class ConstructorOverloading {

    public static void main(String[] args)
    {
        Teachers t1 = new Teachers();
        Teachers t2 = new Teachers("Alice", 20);

        t1.display();
        t2.display();// TODO Auto-generated method stub

    }

}


