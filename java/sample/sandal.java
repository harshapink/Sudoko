/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	int n=5;
	int num=1;
	for(int i=0;i<n;i++)
	{
	    for(int s=0;s<i;s++)
	    {
	        System.out.print(" ");
	    }
	    
	    int n1=num;
	    for(int j=0;j<n-i;j++)
	    {
	          System.out.print(n1+" ");
	        n1++;
	    }
	    num++;
	    System.out.println();
	}
	num=n-1;
	for(int i=2;i<=n;i++)
	{
	    for(int s=0;s<n-i;s++)
	    {
	        System.out.print(" ");
	    }
	    
	    int n1=num;
	    for(int j=1;j<=i;j++)
	    {
	        System.out.print(n1+" ");
	        n1++;
	    }
	    num--;
	    System.out.println();
	}
	}
}
