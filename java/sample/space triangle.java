/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
		    for(int s=0;s<n-i-1;s++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<=i;j++)
		    {
		        if(i==j || i==n-1 || j==0)
		        System.out.print("*"+" ");
		         else
		         System.out.print("  ");
		    }
		    System.out.println();
		}
	}
}
