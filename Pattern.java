/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Pattern {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2="";
		int n=s1.length();
		/*s2=s2+s1.substring(n/2,n);
		s2=s2+s1.substring(0,n/2);*/  //with inbuilt function
		s2=s2+s1.charAt(n/2);
		for(int i=(n/2)+1;i<n;i++)
		{
		s2=s2+s1.charAt(i);
		}
		for(int j=0;j<n/2;j++)
		{
		    s2=s2+s1.charAt(j);
		}
		for(int i=0;i<n;i++)       //iteration
		{
		    for(int j=n-1;j>i;j--)   //for space
		    {
		        System.out.print(" ");
		    }
		    for(int k=0;k<=i;k++)
		    {
		        System.out.print(s2.charAt(k));
		    }
		    System.out.println();
		}
	}
}
