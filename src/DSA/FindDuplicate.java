package DSA;
import java.util.HashSet;
public class FindDuplicate
{
    public static int findDuplicate(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
        {
            if (set.contains(num))
            {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        FindDuplicate duplicate = new FindDuplicate();

        int[] nums = {3, 1, 3, 4, 2};
        System.out.println("Duplicate Number: " + findDuplicate(nums));// TODO Auto-generated method stub

    }
}
