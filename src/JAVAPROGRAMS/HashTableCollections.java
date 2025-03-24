package JAVAPROGRAMS;
import java.util.*;
public class HashTableCollections
{
    public static void main(String[] args)
    {
        Map<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "Red");
        hashtable.put(2, "Blue");
        hashtable.put(3, "Green");

        System.out.println("Color 2: " + hashtable.get(2));
    }
}
