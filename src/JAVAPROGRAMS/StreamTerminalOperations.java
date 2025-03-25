package JAVAPROGRAMS;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;
//COLLECTING RESULTS INTO A LIST
public class StreamTerminalOperations
{
    public static void main(String[] args)
    {
       /* List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = nums.stream()
                .map(n -> n *n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);*/
        //PARALLEL STREAMS--It divides tasks into multiple threads for faster processing
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.parallelStream()
                .forEach(System.out::println);

    }
}
