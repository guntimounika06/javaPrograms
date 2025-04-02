package JAVAPROGRAMS;
import java.util.Set;
import java.util.HashSet;
public class SetToStream
{
    public static void main(String[] args)
    {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        numbers.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
