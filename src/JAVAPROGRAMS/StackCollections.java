package JAVAPROGRAMS;
import java.util.*;
public class StackCollections
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
