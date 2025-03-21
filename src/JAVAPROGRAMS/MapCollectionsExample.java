package JAVAPROGRAMS;

import java.util.*;
public class MapCollectionsExample
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        System.out.println(map.get(2));
        System.out.println(map.keySet());
    }
}

