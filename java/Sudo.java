/*package whatever //do not write package name here */

import java.io.*;

class GFG {
   static  boolean rowcol(int row,int col,int n,int[][] a)
    {
        row=row-1;
        col=col-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[row][i]==n)
            {
                return false;
            }
            
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i][col]==n)
            {
                return false;
            }
        }
        
        return true;
    }
    
   static boolean   inbox(int row,int col,int n,int a[][])
    {
        int r=row-row%3;
        int c=col-col%3;
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
            if(a[i][j]==n)
            {
                return false;
            }
        }
        }
        a[row-1][col-1]=n;
        return true;
    }
    
    
    
    
   static  void print(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    
	public static void main (String[] args) {
	    int[][] a = new int[][] 
    { 
            {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
    }; 
       
		if(rowcol(3,1,9,a))
		{
		    if(inbox(3,1,9,a)){
		    print(a);
		    }
		    
		    else{
		        System.out.println("value exist in block");
		    }
		}
		else
		{
		    System.out.println("value exist in row or column");
		}
		
		
		
	}
}
