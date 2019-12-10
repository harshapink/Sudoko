/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
      static int n=2500;
    static void  Duplicates(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[i]);
                }
            }
        }
        
    }
	public static void main (String[] args) {
	     
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    Duplicates(a);
	    
	    
	}
    
}
