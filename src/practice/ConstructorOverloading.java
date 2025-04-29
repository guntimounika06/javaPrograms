package practice;

class Employee
{
    int id;
    String name;

    Employee()
    {
        id = 0;
        name = "Unknown";
    }

    Employee(int i)
    {
        id = i;
        name = "Unknown";
    }

    Employee(int i, String n)
    {
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101);
        Employee e3 = new Employee(101, "Mouni");

        e1.display();
        e2.display();
        e3.display();
    }

}
