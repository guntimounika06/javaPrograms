package JAVAPROGRAMS;
import java.util.*;
public class ArrayListCollection
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");//Duplicate allowed

        System.out.println(names);
        System.out.println("First Element: " + names.getFirst());

        names.remove(1);

        //Iterating over elements
        for(String name : names)
        {
            System.out.println(name);
        }



    }
}
