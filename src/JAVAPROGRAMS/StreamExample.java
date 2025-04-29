package JAVAPROGRAMS;
/* CREATING STREAM FROM A LIST
import java.util.*;
import java.util.stream.*;
public class StreamExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //Creating a stream from a list
        Stream<Integer> stream = numbers.stream();

        stream.forEach(System.out::println);
    }
}*/
//FROM AN ARRAY
/*import java.util.Arrays;
public class StreamExample
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr)
                .forEach(System.out::println);
    }
}*/
//USING stream.of()
import java.util.stream.*;
public class StreamExample
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("Java" , "Python", "C++");
        stream.forEach(System.out::println);
    }
}


