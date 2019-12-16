/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    static boolean Prime(int n)
{
for(int i=2;i<n/2;i++)
	   {
	       if(n%i==0)
	       {
	           return false;
	       }
	   }
	   return true;
}
	public static void main (String[] args) {
	   String s="92";
	   StringBuffer sb=new StringBuffer(s);
	   int n=Integer.parseInt(s);
	   if(Prime(n))
	   {
	       if(Prime(Integer.parseInt(sb.reverse().toString())))
	       {
	           System.out.println("Prime");
	       }
	   }
	   else{
	       System.out.println("Not Prime");
	   }
	}
}
