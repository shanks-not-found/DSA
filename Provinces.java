import java .util.*;
class Provinces{
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
    static int numProvinces(ArrayList<ArrayList<Integer>>adj,int v)
    {
        boolean vis[]=boolean[v];
        int count=0;
        for(int i=0;i<v;i++)
        {
            if(vis[i]==false)
            {
                count++;
                dfs(i,adj,vis,lst);
            }
        }
        return count;
    }
     public static void main(String args[]) {

        // ------------------------------------
        // MANUAL INPUT (no Scanner used)
        // ------------------------------------

        int V = 5;  // number of vertices

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // ----- MANUALLY ADD EDGES HERE -----

        // Component 1: 0 - 1 - 2
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        // Component 2: 3 - 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // ------------------------------------

        int provinces = numProvinces(adj, V);

        System.out.println("Number of Provinces = " + provinces);
    }
}


