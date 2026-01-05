import java.util.*;
class Solution
{
    public boolean miss(int arr[],int n)
    {
        for(int i=0;i<=n;i++)
        {
           boolean found=false;
           for(int j=0;j<n-1;j++)
           {
             if(arr[j]==i)
             {
                found=true;
                break;
             }
           }
           if(found==false)
           {
            return true;
           }
        }
        return false;
    }
}
class Missing
{
    public static void main(String[]args)
    {
        int arr[]={0,2,3,4,5,6};
        int n=arr.length;
        Solution sol=new Solution();
        boolean miss=sol.miss(arr,n);
        System.out.println("Is there any missing number? "+miss);
    }
}
