package practice;

class Student
{
    int id;
    String name;

    void display()
    {
        System.out.println("ID: " + id + ", Name: "+ name);
    }
}
public class ObjedctExample
{
    public static void main(String[] args)
    {
        // creating an object of a student class
       Student s1 = new Student();
       s1.id =101;
       s1. name = "Honey";

       System.out.println("Student 1: ");
       s1.display();
    }
}
