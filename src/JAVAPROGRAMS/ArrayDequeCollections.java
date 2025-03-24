package JAVAPROGRAMS;
import java.util.*;
public class ArrayDequeCollections
{
    public static void main(String[] args)
    {
       Deque<String> deque = new ArrayDeque<>();

        deque.offer("First");
        deque.offer("Second");
        deque.offer("Third");

        deque.offerFirst("Zero");

        System.out.println("Removed last: " + deque.pollLast());

        System.out.println(deque);
    }
}
