class pair{
     int first;
     int second;
     int third;
     pair(int first,int second,int third)
     {
        this.first=first;
        this.second=second;
        this.third =third;
     }
}
public class Distance
{
    public void distance(int grid[])
    {
        int n=grid.length;
        int m=grid[0]length;
        Queue<node>q=new LinkedList<>();
        int vis[][]=new int[n][m];
        int dis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;i<m;j++)
            {
                if(vis[i][j]==1)
                {
                    q.add(new node(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
         int delrow[]={-1,0,1,0};
         int delcol[]={0,1,0-1};
         while(!q.isEmpty())
         {
            int row=q.poll().first;
            int col=q.poll().second;
            int steps=q.poll().third;
            for(int i=0;i<=4;i++)
            {
                int newrow=row+delrow[i];
                int newcol=col+delcol[i];
                if(newrow>=0 && newrow<n && newcol>=0 && newcol<m && vis[newrow][newcol]==0)
                {
                    vis[newrow][newcol]=1;
                    dis[newrow][newcol]=steps+1;
                    q.add(new node(newrow,newcol,steps+1));

                }
            }
         }
    }
    return dis;
}
