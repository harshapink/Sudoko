
import java.io.*;
import java.util.*;
class GFG {
    static String   check(HashMap<Character,Integer> map,char c)
    {
String s="";
        if(map.containsKey(c))
	{
	    
	    c=(char)((int)c+1);
	    check(map,c);
	   //map.put(c,1);
	}
	else{
	    map.put(c,1);
	    s=s+c;
	    System.out.print(s);
	}
	return s;
    }
	public static void main (String[] args) {
	    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	    String s="aaabcdb";
	    char c='\0';
	    String s1="";
	    for(int i=0;i<s.length();i++)
	    {
           s1=check(map,s.charAt(i));
	    }
//System.out.print(map);
	   
			}
}
