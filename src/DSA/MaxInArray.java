package DSA;

public class MaxInArray
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 5, 30, 50};
        int max = arr[0];

        for (int num : arr)
        {
            if (num > max) max = num;//enerated method stub
        }

        System.out.println("Maximum: " +max);
    }
}
