import java.util.*;
import java.io.*;

class A {   
       static void word(char[] a)
       {
           int n=a.length;
           int t=0;
String[] s = new String[]{ "zero", "one",  
                                        "two", "three", "four", 
                                        "five", "six", "seven",  
                                            "eight", "nine"}; 
String[] tl= new String[]{"", "ten", "eleven", "twelve",  
                                        "thirteen", "fourteen", 
                                        "fifteen", "sixteen", "seventeen", 
                                        "eighteen", "nineteen"}; 
String[] te= new String[]{"", "", "twenty", "thirty", "forty",  
                                            "fifty","sixty", "seventy",  
                                            "eighty", "ninety"}; 
String[] tp= new String[] {"hundred", "thousand"}; 
if(a.length==1 )
{
	System.out.print(s[a[t]-'0']);
	return;
}
if(n>=3)
{
	if(a[t]-'0' >0)
	{
		System.out.print(s[a[t]-'0']);
	}
	if(a[t+1]> 0 && a[t+2]>0 && a[t]-'0'>0)
	{
		System.out.print(tp[t]+"and");
	}
	else if(a[t]-'0' >0)
	{
		System.out.print(tp[a[t]-'0']);
		
	}
}
if(n>=2)
{
	if(a[t+1]-'0' ==1 && a[t+2]-'0' >=0)
	{
		System.out.print(tl[a[t+1]-'0']);
		return;
	}
	else if(a[t+1]-'0' ==0 && a[t+2]-'0' >0)
	{
		System.out.print(s[a[t+2]-'0']);
		return;
	}
	else{
		System.out.print(te[a[t+1]-'0']);
	}
		
}
if(n>=1)
{
	if(a[t+2]-'0'>0)
	{
		System.out.print(s[a[t+2]-'0']);
		return;
	}
}

	System.out.print(s[0]);

}
    
public static void main (String[] args) {
        word("005".toCharArray()); 
}
}







