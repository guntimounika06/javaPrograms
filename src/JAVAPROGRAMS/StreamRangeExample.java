package JAVAPROGRAMS;
import java.util.stream.IntStream;
import java.util.Random;
//RANGE OF STREAM (EXCLUSIVE)
public class StreamRangeExample
{
    public static void main(String[] args)
    {
        IntStream.range(1, 5)//prints only 1 to 4(Exclusive)
                .forEach(System.out::println);
        IntStream.rangeClosed(1, 5)//prints 1 to 5(Inclusive)
                .forEach(System.out::println);
        new Random().ints(5, 10,20)
                .forEach(System.out::println);//Prints 5 random numbers from 10 to 20
    }
}

