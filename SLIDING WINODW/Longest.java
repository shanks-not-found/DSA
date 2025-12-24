import java.util.*;
class Solution{
    public int long(String s)
    {
        int max;
        int left=0;
        int right;
        HashSet<Character>set=new HashSet<>();
        for(right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));
            int len=right-left+1;
            max=Math.max(max,len);

        }
        return max;
    }
}