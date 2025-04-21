package JAVAPROGRAMS;
//Convert List to parallel stream
/*import java.util.Arrays;
import java.util.List;
public class ParallelStreamExample
{
    public static void main(String[] args)
    {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.parallelStream()
                .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));


    }
}*/
//Convert Set to parallel stream
/*import java.util.Set;
import java.util.HashSet;
public class ParallelStreamExample
{
    public static void main(String[] args)
    {
        Set<Integer> numbers = Set.of(10, 20, 30, 40, 50);
        numbers.parallelStream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));
    }
}*/
//Convert Map to Parallel Stream
//Parallel Stream for Map Keys
import java.util.Map;
import java.util.HashMap;

public class ParallelStreamExample
{
    public static void main(String[] args)
    {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102,"Bob");
        students.put(103,"Charlie");

        //Parallel Stream for Map Keys
        students.keySet().parallelStream()
                .forEach(k -> {
                    System.out.println(Thread.currentThread().getName() + " - Key: " + k);
                });

        //Parallel Stream for Map Values
        students.values().parallelStream()
                .forEach(v -> System.out.println(Thread.currentThread().getName() + " - Value: " + v));

        //Parallel Stream for Map Entries
        students.entrySet().parallelStream()
                .forEach(e -> System.out.println(Thread.currentThread().getName() + " - " + e.getKey() + " -> " + e.getValue()));

        //
    }
}


