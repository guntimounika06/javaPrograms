package JAVAPROGRAMS;
import java.util.stream.Stream;
public class StreamNullableExample
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.ofNullable(null);

        System.out.println("Stream count: " + stream.count());

    }
}
