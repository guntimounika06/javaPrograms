package JAVAPROGRAMS;
import java.util.*;
public class HashMapCollections
{
    public static void main(String[] args)
    {
       Map<Integer, String> students = new HashMap<>();

       students.put(101, "Alice");
       students.put(102, "Bob");
       students.put(103, "Charlie");
       students.put(104, "Alice");

       System.out.println("Student 102: " + students.get(102));

       for(Map.Entry<Integer, String> entry : students.entrySet())
       {
           System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
       }
    }
}
