package JAVAPROGRAMS;
import java.util.*;
public class HashSetCollections
{
    public static void main(String[] args)
    {
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
       // names.add("Alice");

        System.out.println("Contains Bob? " + names.contains("Bob"));

        System.out.println(names);
    }
}
