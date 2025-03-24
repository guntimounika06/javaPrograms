package JAVAPROGRAMS;
import java.util.*;
public class PriorityQueueCollections
{
    public static void main(String[]args)
    {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);

        System.out.println("Removed: " + pq.poll());
        System.out.println(pq);
    }
}
