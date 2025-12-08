import java.util.*;

public class Dfs {
    public static void dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean vis[],ArrayList<Integer>lst)
    {
        vis[node]=true;
        lst.add(node);
        for(int it:adj.get(node))
        {
            if(vis[it]==false)
            {   
                dfs(it,adj,vis,lst);
            }
        } 
    }

    public ArrayList<Integer>dfsofgraph(int v,ArrayList<ArrayList<Integer>>adj)
    {
    boolean vis[]=new boolean[v+1];                         
    vis[0]=true;
    ArrayList<Integer>lst=new ArrayList<>();
    dfs(0,adj,vis,lst);
    return lst;
}
}


