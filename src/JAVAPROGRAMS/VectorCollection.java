package JAVAPROGRAMS;
import java.util.*;

public class VectorCollection
{
    public static void main(String[] args)
    {
        List<String> vectorList = new Vector<>();

        vectorList.add("Red");
        vectorList.add("Green");
        vectorList.add("Blue");

        System.out.println("First color: " + vectorList.getFirst());

        vectorList.remove(1);

        System.out.println("After removing an element: " + vectorList);

        for (String s : vectorList) System.out.println(s);
    }
}
