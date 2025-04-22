package JAVAPROGRAMS;
import java.util.Map;
import java.util.HashMap;
public class MapKeyStream
{
    public static void main(String[] args)
    {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        //Map keys to stream
        students.keySet()//print keys
                .forEach(System.out::println);

        //Map Values to Stream
        students.values()//print values
                .forEach(System.out::println);

        //Map entries to Stream
        students.forEach((key, value) -> System.out.println(key + " -> " + value));


    }
}
