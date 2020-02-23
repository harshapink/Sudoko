import java.util.*;
import java.io.*;

public class A {   
static Set<String> d=new HashSet<String>();
static boolean word(String s,String new1)
{
	
	int n=s.length();
	
	if(n==0)
	{
		System.out.println(new1);
		return true;
	}
	for(int i=1;i<=n;i++)
	{
		if(d.contains(s.substring(0,i))&& word(s.substring(i,n),new1+" "+s.substring(0,i)))
		{
			return true;
		}
			
	}
	return false;
}

public static void main (String[] args) {
	String s1[]={"hi","hello","ajith","harsha","love"};
	for(String s3:s1)
	{
		d.add(s3);
	}
	System.out.println(word("ajithloveharsha",""));
	System.out.println(word("ajithlovesomeone",""));
		 
}
}
