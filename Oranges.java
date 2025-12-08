import java.util.*;
class pair{
    int row;
    int col;
    int time;
    pair(int row,int col,int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
public class Oranges
{
    public void rotting(int grid[][])
    {
        int n = grid.length;
        int m= grid[0].length;
        Queue<pair>q=new LinkedList<>();
        int vis[][]=new int[n][m];
        int cntFresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1)
                {
                    cntFresh++;
                }
            }
        }
    }
    int tm=0;
    int drow={-1,0,1,0};
    int dcol={0,1,0,-1};
    int count=0;
    while(!q=isEmpty)
    {
        int r=r.poll();
        int c=c.poll();
        int t=t.poll();
        tm=Math.max(tm,t);
        for(int i=0;i<4;i++)
        {
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
            {
                q.add(new pair(nrow,ncol,t+1));
                vis[nrow][ncol]=2;
                count++;
            }
        }
    }
    if(cntFresh!=count)
    {
        return -1;
    }
    return tm;
}