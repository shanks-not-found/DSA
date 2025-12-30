import java.util.*;

class Solution
{
    public static void rotate(int num[])
    {
        int temp = num[0];
        for(int i = 0; i < num.length - 1; i++)
        {
            num[i] = num[i + 1];
        }
        num[num.length - 1] = temp;
    }
}

public class rotateone
{
    public static void main(String args[])
    {
        int num[] = {10, 40, 30, 95, 89};
        Solution sol = new Solution();
        sol.rotate(num);
        for(int nums : num)
        {
            System.out.println(nums + " ");
        }
    }
}
