package JAVAPROGRAMS;
import java.util.*;
public class TreeMapCollections
{
    public static void main(String[] args)
    {
        Map<Integer, String> employees = new TreeMap<>();

        employees.put(105, "David");
        employees.put(101, "Alice");
        employees.put(103,"Charlie");

        System.out.println(employees);

    }
}
