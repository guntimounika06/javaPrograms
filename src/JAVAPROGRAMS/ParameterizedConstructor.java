package JAVAPROGRAMS;
class Principal
{
    String name;
    int age;


    Principal(String studentName, int studentAge)
    {
        name = studentName;
        age = studentAge;
    }

    void display()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParameterizedConstructor
{

    public static void main(String[] args)
    {
        Principal p1 = new Principal("Alice" , 20);
        Principal p2 = new Principal("Bob", 22);

        p1.display();
        p2.display();// TODO Auto-generated method stub

    }

}


