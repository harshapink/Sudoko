/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static boolean substring(String s,String s1)
    {
        int k=0;
		for(int i=0;i<s1.length();i++)
		{
		    for(int j=0;j<s.length();j++)
		    {
		        if(s1.charAt(i)==s.charAt(j))
		        {
		            k=j;
		            if(s.substring(k,k+s1.length()).equals(s1))
		    {
		        System.out.print("yes");
		        return true;
		    }
		    else
		       continue;
		        }
		    }
		    
		}
		return false;
    }
	public static void main (String[] args) {
		String s="harshavar";
		String s1="ava";
		substring(s,s1);
	}
}
