import java.util.*;
import java.io.*;
public class Solution {
    public ArrayList<Integer>bfsofgraph(int v,ArrayList<ArrayList<Integer>>adj)
    {
        ArrayList<Integer>bfs=new ArrayList<>();
        boolean vis[]= new boolean[v];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty())
        {
            Integer node=q.poll();
            bfs.add(node);
        
        for(int it:adj.get(node))   
        {
            if (vis[it]==false)
            {
                vis[it]=true;
                q.add(it);
            }
        }
        
    }
    return bfs;
    
}
}
class Main{


    public static void main(String args[])
{
    int v=4;
    ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
    for(int i=0;i<v;i++)
    {
        adj.add(new ArrayList<>());
    }
    adj.get(0).add(1);
    adj.get(1).add(0);

    adj.get(0).add(2);
    adj.get(2).add(0);

    adj.get(1).add(2);
    adj.get(2).add(1);

    adj.get(1).add(3);
    adj.get(3).add(1);
    Solution a=new Solution();
    ArrayList<Integer>result=a.bfsofgraph(v,adj);
    for(int i :result)
    {
        System.out.println(i);
    }
}
}


