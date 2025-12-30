class Solution
{
    public static void rotate(int num[],int k)
    {
        for(int i=0;i<k;i++)
        {
            int temp=num[0];
            for(int j=0;j<num.length-1;j++)
            {
                num[j]=num[j+1];
            }
            num[num.length-1]=temp;            
        }
    }
}
class rotatek
{
    public static void main(String args[])
    {
        int num[]={10,40,50,68,90};
        int k=4;
        Solution sol=new Solution();
        sol.rotate(num,k);
        for(int nums:num)
        {
            System.out.println(nums+" ");
        }
        
    }
}