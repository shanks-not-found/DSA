
import java.util.*;
public class Provinces{
    public static void dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean vis[])
    {
        vis[node]=true;
        for(int it:adj.get(node))
        {
            if(vis[it]==false)
            {
                dfs(it,adj,vis);
            }
        }
    }
    public static int numProvinces(ArrayList<ArrayList<Integer>>adj, int v)
    {
        boolean vis[]=new boolean[v];
        int count=0;
        for(int i=0;i<v;i++)
        {
            if(vis[i]==false)
            {
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }               
}