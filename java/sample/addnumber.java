/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static String  reverse(int n)
    {
        String s="";
        s=s+n;
        StringBuilder sb=new StringBuilder(s);
        sb= sb.reverse();
        return sb.toString();
        
    }
	public static void main (String[] args) {
		int n=2875;
		String s1="";
		s1=s1+n;
		int a=4;
		String s="";
		while(n>0)
		{
		    int r=n%10;
		    r=r+a;
		    s=s+reverse(r);
		    n=n/10;
		}
	   s=reverse(Integer.parseInt(s));
		System.out.println(s);
	
	}
}
