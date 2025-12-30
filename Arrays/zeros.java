import java.util.*;
class Solution
{
    public void zero(int nums[])
    {
        int left=0;
        int right;
        for(right=0;right<num.length;right++)
        {
            if(nums[right]!=0)
            {
                nums[left]=nums[right];
                left++;
            }
        }    
            while(left<num.length)
            {
                nums[left]=0;
                left++;
            }
    }
}
class zeros
{
    public static void main(String args[])
    {
        int nums[]={10,30,50,70,0,90,0,100,0};
        Solution sol=new Solution();
        zero(nums);
        for(int n:nums)
        {
            System.out.println(n+" ");
        }
    }
}