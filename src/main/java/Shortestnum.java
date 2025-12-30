import java.util.*;

class Solution
{
    public static int shortestnum(int n, int arr[])
    {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < smallest)
            {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondsmallest && arr[i] != smallest)
            {
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }
}

public class Shortestnum
{
    public static void main(String args[])
    {
        int arr[] = {10, 20, 5, 34, 80};
        int n = arr.length;
        int result = Solution.shortestnum(n, arr);
        System.out.println("The second smallest number is: " + result);    
    }
}
