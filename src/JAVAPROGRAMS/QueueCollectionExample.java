package JAVAPROGRAMS;
import java.util.*;
public class QueueCollectionExample
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println(queue.poll());//removes first element
        System.out.println(queue);
    }
}
