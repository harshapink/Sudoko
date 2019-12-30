/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static void check(char c)
    {
        

    }
	public static void main (String[] args) {
	    String s="aaabcdb";
	    char c='\0';
	    String s1="";
	    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	    for(int i=0;i<s.length();i++)
	    {
	        	
	if(map.containsKey(s.charAt(i)))
	{
	    
	    c=(char)((int)s.charAt(i)+1);
	    System.out.println(c);//check(c);
	    map.put(c,1);
	}
	else{
	    map.put(s.charAt(i),1);
	}
	
	    }
	    
	
		
			}
}
