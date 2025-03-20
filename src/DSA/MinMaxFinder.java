package DSA;

public class MinMaxFinder
{
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty. ");
            return;
        }


        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }
        System.out.println("Smallest Number: " + min);
        System.out.println("Largest Number: " + max);
    }
   public static void main(String[] args)
   {
       int[] arr = {15, 3, 7, 20, 9, 11, 5, 1};
       findMinMax(arr);
    // TODO Auto-generated method stub

   }

}
