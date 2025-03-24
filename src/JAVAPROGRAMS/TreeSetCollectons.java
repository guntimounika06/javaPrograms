package JAVAPROGRAMS;
import java.util.*;
public class TreeSetCollectons
{
    public static void main(String[] args)
    {
        Set<Integer> sortedNumbers = new TreeSet<>();

        sortedNumbers.add(50);
        sortedNumbers.add(10);
        sortedNumbers.add(30);
        sortedNumbers.add(20);
        //sortedNumbers.add(10);//ignored
        System.out.println(sortedNumbers);
    }
}
