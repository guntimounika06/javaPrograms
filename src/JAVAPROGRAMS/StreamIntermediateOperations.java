package JAVAPROGRAMS;
import java.util.*;

public class StreamIntermediateOperations
{
    public static void main(String[] args)
    {
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);*/
        List<String> words = Arrays.asList("Java", "Stream", "Api");
        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
