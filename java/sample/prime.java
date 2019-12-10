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
static boolean length(String s,String s1)
{
    int count=0;
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
	               return true;
	           }
	           else
	           return false;
}

static int large(int n)
{
    String s=Integer.toString(n);
	String s1=Integer.toString(n);
	int sum=0;
	if(isPrime(n))
	{
	       if(sum<n)
	       {
	           sum=n;
	           s1=Integer.toString(sum);
	           if(length(s,s1))
	           {
	               sum=n;
	               
	           }
	           }
	       }
	  return ++n;
}
	public static void main (String[] args) {
	int n=4;
	String s=Integer.toString(n);
	String s1=Integer.toString(n);
	 check(n,s,s1);
	
	}
}
