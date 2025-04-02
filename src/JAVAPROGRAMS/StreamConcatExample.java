package JAVAPROGRAMS;
import java.util.stream.Stream;
public class StreamConcatExample
{
    public static void main(String[] args)
    {
        Stream<String> stream1 = Stream.of("Apple", "Banana");
        Stream<String> stream2 = Stream.of("Cherry", "Date");

        Stream<String> mergedStream = Stream.concat(stream1, stream2);

        mergedStream.forEach(System.out::println);
    }
}
