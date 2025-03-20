package JAVAPROGRAMS;
class Student
{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age > 0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Age must be positive!");
        }
    }
}

//MAIN CLASS

public class Encapsulation
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Student s1 = new Student("John" , 20);

        //ACCESSING DATA USING GETTERS
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        //MODIFYING DATA USING SETTERS
        s1.setName("Alice");
        s1.setAge(22);


        System.out.println("\nUpdated Name: " + s1.getName());
        System.out.println("Updated Age: " + s1.getAge());

        s1.setAge(-2);


    }

}

