package JAVAPROGRAMS;
import java.util.*;
public class LinkedHashMapCollections
{
    public static void main(String[] args)
    {
        Map<String, Integer> loginAttempts = new LinkedHashMap<>();

        loginAttempts.put("User1", 3);
        loginAttempts.put("User2", 1);
        loginAttempts.put("User3", 5);

        System.out.println(loginAttempts);
    }
}
