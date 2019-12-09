/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		String s="ajith kannan";
		char a[]=new char[s.length()];
		char b[]=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
		    a[i]=s.charAt(i);
		}
		for(int i=0;i<a.length;i++)
		    {
		        if(a[i]==' ' ||a[i]=='a'|| a[i]=='e' ||a[i]=='i'||a[i]=='o'||a[i]=='u') 
		        {
		        b[i]=a[i];
		        }
		        else{
		          b[i]='\0';
		        }
		    }
		    
		    for(int i=a.length-1;i>=0;i--)
		    { 
		        if(a[i]=='a' || a[i]=='e' || a[i]=='i' ||a[i]=='o' ||a[i]=='u' || a[i]==' ')
		        {
		           continue;
		        }
		        else{
		        for(int j=0;j<b.length;j++)
		        {
		        if(b[j]=='\0'){
		          b[j]=a[i];
		          break;
		        }
		        
		        }
		        }
		    }
		    for(int i=0;i<b.length;i++)
		    {
		        System.out.print(b[i]);
		    }
		    
		   }
		}
		    
	
