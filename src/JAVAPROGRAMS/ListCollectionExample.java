package JAVAPROGRAMS;
import java.util.*;

public class ListCollectionExample
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");
        System.out.println(names);
    }
}
