import java.util.*;

public class Bipartitee
{
    public boolean dfs(int node, int col, int color[], ArrayList<ArrayList<Integer>> adj)
    {
        color[node] = col; // assign color 0 or 1

        for (int it : adj.get(node))
        {
            // If uncolored, color with opposite color
            if (color[it] == -1)
            {
                if (dfs(it, 1 - col, color, adj) == false)
                    return false;
            }
            // If already colored and same color → not bipartite
            else if (color[it] == col)
            {
                return false;
            }
        }
        return true;
    }

    public boolean check(int v, ArrayList<ArrayList<Integer>> adj)
    {
        int color[] = new int[v];
        Arrays.fill(color, -1); // initialize all as uncolored

        for (int i = 0; i < v; i++)
        {
            if (color[i] == -1)
            {
                if (dfs(i, 0, color, adj) == false) // start with color 0
                    return false;
            }
        }
        return true;
    }
}
