/*package whatever //do not write package name here */

import java.io.*;


class GFG {
    static boolean isPrime(int n)
{
    int flag=0;
    for(int i=2;i<=n;i++)
	{
	    if(n%i==0)
	    {
	        flag=1;
	        break;
	    }
	}
	if(flag==0)
	  return true;
	else
	  return false;

	    
}
static int check(int n,String s,String s1)
{
    
	if(s.length()!=s1.length())
	       return n;
	else
	      return large(n);
}

static int large(int n)
{
    String s=Integer.toString(n);
	String s1=Integer.toString(n);
	int sum=0,count=0;
	
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
	public static void main (String[] args) {
	int n=4;
	String s=Integer.toString(n);
	String s1=Integer.toString(n);
	 check(n,s,s1);
	
	}
}
