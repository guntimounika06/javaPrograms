package JAVAPROGRAMS;
import java.util.HashMap;
import java.util.Map;
public class StudentRecords
{
    private Map<Integer, String> students = new HashMap<>();

    public StudentRecords()
    {
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
    }

    public void displayStudents()
    {
        System.out.println("\nStudent Records: ");
        for(Map.Entry<Integer, String> entry : students.entrySet())
        {
           System.out.println("Roll NO: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
