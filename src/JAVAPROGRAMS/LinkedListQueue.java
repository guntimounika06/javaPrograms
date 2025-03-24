package JAVAPROGRAMS;
import java.util.*;
public class LinkedListQueue
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Front: " + queue.peek());//see front element

        System.out.println("Removed: " + queue.poll());//removing element

        System.out.println(queue);



    }
}
