import java.util.*;

class Solution
{
    public static boolean sorted(int n, int arr[])
    {
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}

public class Sorted
{
    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        boolean result = Solution.sorted(n, arr);
        System.out.println("Is array sorted? " + result);
    }
}
