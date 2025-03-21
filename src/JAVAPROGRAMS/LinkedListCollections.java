package JAVAPROGRAMS;
import java.util.*;

public class LinkedListCollections
{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("LinkedList: " + numbers);

        numbers.addFirst(5);

        System.out.println("After adding element to LinkedList: " + numbers);


        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After deleting elements from LinkedList: " + numbers);
    }
}
