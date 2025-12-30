import java.util.*;

class Solution
{
    public static int secondlargest(int n, int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > largest)
            {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest)
            {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}

public class longestnum
{
    public static void main(String args[])
    {
        int arr[] = {10, 20, 60, 34, 80};
        int n = arr.length;
        int result = Solution.secondlargest(n, arr);
        System.out.println("The second largest number is: " + result);    
    }
}
