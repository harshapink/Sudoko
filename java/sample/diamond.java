/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	   int n=7;
	   int k=1;
	   for(int i=0;i<n;i++)
	   {
	           if(i>=n/2 )
	           {
	               
	               for(int s=0;s<i-(n/2);s++)
	               {
	                   System.out.print(" ");
	               }
	               for(int j=0;j<k;j++)
	               {
	                   System.out.print("*");
	               }
	               k=k-2;
	               System.out.println();
	           }
	           else{
	               for(int s=0;s<(n/2)-i;s++)
	               {
	                   System.out.print(" ");
	               }
	               for(int j=0;j<k;j++)
	               {
	                   System.out.print("*");
	               }
	               k=k+2;
	               System.out.println();
	           }
	       
	   }
	}
}
