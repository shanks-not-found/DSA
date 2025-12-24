import java.util.*;
class Solution
{
    public int longest(int []num,int k)
    {
    int max=0;
    int left=0;
    int right=0;
    int maxzero=0;
    for(right=0;right<=num.length;right++)
    {
        if(num[right]==0)
        {
            maxzero++;            
        }
        if(maxzero>k)
        {
            left++;
            if(num[left]==0)
            {
                maxzero--;
            }
        }
        int len=right-left+1;
        max=Math.max(max,len);

    }
    return max;
    }
}