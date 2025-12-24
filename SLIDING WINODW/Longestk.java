import java.util.*;
class Solution
{
    public int longest(String s,int k)
    {
        int max=0;
        int left=0;
        int right;
        HashMap<Character,Integer>map=new HashMap<>();
        for(right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k)
            {
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0)
                {
                    map.remove(leftchar);
                }
                left++;
            }
            int len=right=left+1;
            max=Math.max(max,len);

        }
        return max;
    }
}
public class Longestk {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "eceba";
        int k = 2;
        System.out.println(sol.longest(s, k));
    }
}