/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
int sum=10;
String s="";
int k=0;
int a[]={2,3,5,8,10};
for(int i=1;i<=(int)Math.pow(2,a.length)-1;i++)
{
    
  for(int j=0;j<a.length;j++)
  {
      
      if((i&(1<<j))>0)
        {
            k=k+a[j];
            s=s+a[j];
  //System.out.print(a[j]);
        
          }
          
      }
      if(k==sum)
      {
         System.out.println(s);
          
      }
      k=0;
      s="";

      
     // System.out.println();
  }
	}
}
