package practice;
import java.util.*;
public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> array = new ArrayList<>();
        array.add("Course");
        array.add("Name");
        array.add("Duration");
        array.add("Fee");
        array.removeLast();
        System.out.println(array);
    }
}
