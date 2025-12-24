import java.util.*;
class Solution
{
    public int repeat(int[] fruits)
    {
        int max;
        HashMap<Integer,Integer>map=new HashMap<>();
        int left;
        int right=0;
        for(right=0;right<=fruits.length;right++)
        {
            if(map.containsKey(fruits[right]))
            {
                map.put(fruits[right],map.get(fruits[right])); 
            }
            else
            {
                map.put(fruits[right],1);
            }
            while(map.size()>2)
            {
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left]==0))
                {
                    map.remove(fruits[left]);
                }
                left++;
            }
            int maxfruits=Math.max(maxfruits,right-left+1);
        }
        return maxfruits;
            
    }  

}
