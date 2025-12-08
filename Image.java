import java.util.*;
public class Image
{
    private void dfs(int row ,int col,int image[][],int ans[][],int delrow[],int delcol[],int newcolor,int inicolor)
    {
        ans[row][col]=newcolor;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++)
        {
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 &&ncol<m && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=newcolor)
            {
                dfs(nrow,ncol,image,ans,delrow,delcol,ans,newcolor,inicolor);
            }
        }
    
    }
    public int[][] floodfill(int image[][],int sr,int sc, int newcolor)
    {
        int inicolor=image[sr][sc];
        int ans[][]=image;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        dfs(sr,sc,image,ans,delrow,delcol,ans,newcolor,inicolor);
        return ans; 
        

    }
}
