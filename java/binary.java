import java.util.*;
import java.io.*;

public class A {   
public static void main (String[] args) {
String s="112";
String s1="";
String s2="";
while(Integer.parseInt(s)>0)
{
	s2="";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)-'0'>0)
	{
		int n=s.charAt(i)-'0'-1;
		s2=s2+n;
		s1=s1+"1";
	}
	else
	{
		s1=s1+'0';
	}
}
System.out.println(s1);
s1="";
s=s2;
}
}
}
