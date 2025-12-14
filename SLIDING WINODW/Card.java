import java.util.*;
class Solution
{
    public int maxslidingwindow(int points[],int k)
    {
        int maxpoints;
        int total=0;
        int n= points.length;
        for(int i=0;i<k;i++)
        {
            total=points[i]+total;
        }
        maxpoints=total;
        for(int i=0;i<k;i++)
        {
            total=total-points[k-1-i];
            total=total+points[n-1-i];
            maxpoints=Math.max(maxpoints,total);
        }
        return maxpoints;


    }
}
class Card
{
    public static void main(String args[])
    {
        int cards[]={1,4,5,6,7,7,9};
        int k=4;
        Solution sol=new Solution();
        System.out.println(sol.maxslidingwindow(cards,k));
    }
}