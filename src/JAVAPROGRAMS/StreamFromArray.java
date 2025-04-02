package JAVAPROGRAMS;
import java.util.Arrays;
//import java.util.stream;
public class StreamFromArray
{
    public static void main(String[] args)
    {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        //Stream<String> fruitStream = Arrays.stream(fruits);
        //fruitStream.forEach(System.out::println);
        Arrays.stream(fruits).forEach(System.out::println);//Arrays.stream()
    }
}
