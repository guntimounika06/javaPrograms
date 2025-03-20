package DSA;

public class StringRecursive
{
    public static String reverse(String str) {
        // Base Case: If the string is empty or has only one character, return it
        if (str.isEmpty()) {
            return str;
        }
        // Recursive Case: Reverse substring from index 1 onwards and append first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
