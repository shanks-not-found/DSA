import java.util.*;
public class Bipartite
{
    public boolean isbapertite(int v,int start,ArrayList<ArrayList<Integer>>adj,int color[])
    {
        color[start]=0;
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int it:adj.get(node))
            {
                if(color[it]==-1)
                {
                    color[it]=1-color[node];
                    q.add(it);
                }
                else if(color[it]==color[node])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkbipartite(int v,ArrayList<ArrayList<Integer>>adj)
    {
        int color[]=new int[v];
        for(int i=0;i<v;i++)
        {
            color[i]=-1;
        }
        for(int i=0;i<v;i++)
        {
            if(color[i]==-1)
            {
                if(isbapertite(v,i,adj,color)==false)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
