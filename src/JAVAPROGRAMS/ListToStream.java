package JAVAPROGRAMS;
import java.util.Arrays;
import java.util.List;
public class ListToStream
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()//converting list to stream
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
