package practice;
import java.util.*;
import java.util.HashSet;

public class SetExample
{
    public static void main(String[] args)
    {
        Set<String> vegetables = new HashSet<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Brinjal");
        //vegetables.add("Potato");//dont allow duplicates in set

        System.out.println(vegetables);
    }
}
