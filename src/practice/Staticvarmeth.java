package practice;
class Students
{
    int id;
    String name;

    //Static variable - shared by all objects
    static String college = "JNTUH";


    //constructor
    Students(int i, String n)
    {
        id = i;
        name = n;
    }

    //static method - can access only static memebers
    static void changeCollege(String newCollege)
   {
     college = newCollege;
   }

   //Instance method- can access both static and non-static members
   void display()
   {
     System.out.println("ID: " + id + ", Name: " + name + ", College: "+ college);
   }
}
public class Staticvarmeth
{
    public static void main(String[] args)
    {
        //change college using static method
        Students.changeCollege("Osmania University");

        //creating objects
        Students s1 = new Students(101, "Honey");
        Students s2 = new Students(102, "Mouni");

        s1.display();
        s2.display();
    }

}
