package JAVAPROGRAMS;
class Company
{
    String name;
    int age;

    Company(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    Company(Company c)
    {
        this.name = c.name;
        this.age = c.age;
    }

    void display()
    {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}

public class CopyConstructor {

    public static void main(String[] args)
    {
        Company c1 = new Company("Alice" , 20);
        Company c2 = new Company(c1);

        c1.display();
        c2.display();
        // TODO Auto-generated method stub

    }

}

