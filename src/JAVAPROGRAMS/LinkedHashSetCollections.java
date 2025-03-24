package JAVAPROGRAMS;
import java.util.*;
public class LinkedHashSetCollections
{
    public static void main(String[] args)
    {
       Set<Integer> numbers = new LinkedHashSet<>();

       numbers.add(30);
       numbers.add(10);
       numbers.add(20);
       //numbers.add(10);

       System.out.println(numbers);
    }
}
