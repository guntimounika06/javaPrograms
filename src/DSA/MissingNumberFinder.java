package DSA;
import java.util.HashSet;

public class MissingNumberFinder
{
    public static int findMissingNumber(int[] arr, int n)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            set.add(num);
        }

        for (int i = 1; i <= n; i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args)
    {
        int n = 1000;
        int[] arr = new int[n-1];

        int missing = 786, index = 0;
        for (int i =1; i<=n; i++)
        {
            if (i != missing)
            {
                arr[index++] = i;
            }
        }


        int result = findMissingNumber(arr, n);
        System.out.println("Missing Number: "+result);

    }
}
