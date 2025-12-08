    import java.util.*;                                                                                 
    public class Cyclee
    {
        public static boolean dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean vis[],int parent)
        {
            vis[node]=true;
            for(int it:adj.get(node))
            {
                if(vis[it]==false)
                {
                    if(dfs(it,adj,vis,node)==true)
                    {
                        return true;
                    }
                    else if(parent!=it)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
        public static boolean iscycle(int v,ArrayList<ArrayList<Integer>>adj)
        {
            boolean vis[]=new boolean[v];
            for(int i=0;i<v;i++)
            {
                if(vis[i]==false)
                {
                    if(dfs(i,adj,vis,-1)==true)
                    {
                        return true;
                    }
                }
                return false;
            }
        }
                                                                                

    }

