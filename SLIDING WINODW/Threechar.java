import java.util.*;
class Solution
{
    public int longest(String s)
    {
        int left=0;
        int right;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3)
            {
                count+=s.length()-right;
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0)
                {
                    map.remove(leftchar);
                }
                left++;
            }
            
        }
         return count;
    }
}