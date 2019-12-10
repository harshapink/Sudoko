/*package whatever //do not write package name here */

import java.io.*;


class GFG {
    static boolean isPrime(int n)
{
    int flag=0;
    for(int i=2;i<=n/2;i++)
	{
	    if(n%i==0)
	    {
	        flag=1;
	        break;
	    }
	}
	if(flag==1)
	  return false;
	 
	 return true;
	    
}
	public static void main (String[] args) {
	int n=17;
	String s=Integer.toString(n);
	String s1="";
	int sum=0,count=0;
	while(s.length()!=s1.length())
	{
	if(isPrime(n))
	{
	       if(sum<n)
	       {
	           sum=n;
	           s1=Integer.toString(sum);
	           for(int i=0;i<s.length();i++)
	           {
	               for(int j=0;j<s1.length();j++)
	               {
	               if(s.charAt(i)==s1.charAt(j))
	               {
	                   count=count+1;
	               }
	               }
	           }
	           if(count==s.length())
	           {
	               sum=n;
	               count=0;
	           }
	           }
	       }
	  n++; 
	}
	System.out.println(n);
	}
}
