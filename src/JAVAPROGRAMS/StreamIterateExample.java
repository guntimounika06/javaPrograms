package JAVAPROGRAMS;
import java.util.stream.Stream;
public class StreamIterateExample
{
    public static void main(String[] args)
    {
        Stream.iterate(1, n -> n+2)
                .limit(5)
                .forEach(System.out::println);
    }
}
