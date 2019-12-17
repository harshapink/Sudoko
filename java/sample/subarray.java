/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	  int a[]={1,2,3};
	  int n=a.length;
	  int p=(int)Math.pow(2, n);
	  //System.out.print(p-1);
	  for(int i=1;i<=p-1;i++)
	  {
	      for(int j=0;j<n;j++)
	      {
	          if((i&(i<<j))>0)
	          {
	          System.out.println(a[i]+","+a[j]);
	          }
	      }
	  }
	}
}
