import java. util.*;
class Topological
{
    public void dfs(int node,ArrayList<ArrayList<Integer>>adj,int vis[],Stack<Integer>st)
    {
        vis[node]=0;
        for(int i:adj.get(node))
        {
            if(vis[i]==0)
            {
                dfs(i,adj,vis,st);

            }

        }
        st.push(node);
    }
    public int[] topo(int v,ArrayList<Integer>adj)
    {
        int vis[]=new int [v];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<v;i++)
        {
            if(vis[i]==0)
            {
                dfs(i,adj,vis,st);
            }

        }
        int ans[]=new int [v];
        int i=0;
        while(!st.isEmpty())
        {
            ans[i]=st.peek();
            st.pop();
            i++;
        }
    return ans;
    }
}