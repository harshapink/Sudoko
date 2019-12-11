/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    static boolean panagram(HashMap<Character,Integer> m,String new1)
{
    char s1='A';
	 for(int i=0;i<26;i++)
	 {
	         m.put(s1,0);
	         s1=(char)((int)s1+1);
	         
	 }
	 for(int i=0;i<new1.length();i++)
	 {
	     if(m.containsKey(new1.charAt(i)))
	     {
	         m.put(new1.charAt(i),1);
	     }
	     else{
	         m.put(new1.charAt(i),1);
	     }
	     
	 }
	
	     if(m.containsValue(0))
	     {
	         System.out.print("not paangram");
	         return false;
	     }
	    else{
	        System.out.print("panagram");
	        return true;
	 }

}
	public static void main (String[] args) {
	    HashMap<Character,Integer> m=new HashMap<Character,Integer>();
	 String s="abCdeF ghiJklmnOP QRStuv wxyZ";
	 StringBuilder sb=new StringBuilder(s);
	 sb.replace(0,s.length(),s.substring(0,s.length()).toUpperCase());
	 String new1=sb.toString();
	  panagram(m,new1);
	 
	}
}
