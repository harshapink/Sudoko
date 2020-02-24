import java.util.*;
class D
{
    static void find(int a[][],boolean v[][],int i,int j)
    {

        if(i==a.length-1 && j==a.length-1)
        {
            v[i][j]=true;
             for(int k=0;k<a.length;k++)
            {
                for(int l=0;l<a.length;l++)
                {
                    System.out.print(v[k][l]);
                }
                System.out.println();
            }
            return ;
        }
        if(i+1<a.length && v[i+1][j]!=true && a[i+1][j]==1)
        {
            v[i+1][j]=true;
            find(a,v,i+1,j);
            v[i+1][j]=false;                   
        }
        if(i-1>0 && v[i-1][j]!=true && a[i-1][j]==1)
        {
            v[i-1][j]=true;
            find(a,v,i-1,j);
            v[i-1][j]=false;
        }
        if(j+1<a.length && v[i][j+1]!=true && a[i][j+1]==1)
        {
            v[i][j+1]=true;
            find(a,v,i,j+1);
            v[i][j+1]=false;
        }
        
        if(j-1>0 && v[i][j-1]!=true && a[i][j-1]==1)
        {
            v[i][j-1]=true;
            find(a,v,i,j-1);
            v[i][j-1]=false;
        }
        
        if(i-1> 0 && j-1>0 && v[i-1][j-1]!=true && a[i-1][j-1]==1)
        {
            v[i-1][j-1]=true;
            find(a,v,i-1,j-1);
            v[i-1][j-1]=false;
        }
        
        if(i-1>0 && j+1<a.length && j-1>0 && v[i-1][j+1]!=true && a[i-1][j+1]==1)
        {
            v[i-1][j+1]=true;
            find(a,v,i-1,j+1);
            v[i-1][j+1]=false;
        }
        
        
        
        
        
        
        
        
        
    }
    public static void main(String args[])
    {
        int a[][]={{1,0,0},{1,1,1},{0,0,1}};
        
        boolean v[][]={{false,false,false},
                     {false,false,false},
                     {false,false,false},
                     };

          v[0][0] = true;
        find(a,v,0,0);
                
           
}
