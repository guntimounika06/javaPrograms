package DSA;

import java.util.Arrays;

public class BinarySearch
{

    public static int binarySearch(int[] arr, int Key)
    {
        int left = 0, right = arr.length -1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] == Key) return mid;
            if(arr[mid] < Key) left = mid +1;
            else right = mid -1;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int Key = 8;
        int index = binarySearch(arr, Key);
        System.out.println(index != -1 ? "Found at index " + index : "Not found");// TODO Auto-generated method stub

    }

}