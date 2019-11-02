/*WANT TO FIND CONVERT THE STRING INTO TWO DIMENSIONAL MATRIX AND HAVE TO FIND THE SUBSTRING
THEY GAVE INPUT "WELCOMETOZOHOCORPORATION" AND HAVE TO  HAVE TO FIND THE SUBSTRING  "TOO" */
import java.util.*;
import java.io.*;

/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class D {
	static int checklr(String s1,char a[][],int i,int j)
	{
     int t=0,k=0;
     for(j=j;j<s1.length();j++)
         {
            if( a[i][j]==(s1.charAt(t)) && t<s1.length())
			{
                  t++;
			      k=j;
			}
			else 
				return 1;
         }
		 
        if(t==s1.length())
		{
			System.out.print(i+"  "+k);
		}
		return 1;
         
 }
 static int  checktb(String s1,char a[][],int i,int j)
 {
	 int t=0,k=0;
     for(i=i;i<s1.length();i++)
         {
            if( a[i][j]==(s1.charAt(t)) && t<s1.length())
			{
				//System.out.print(s1.charAt(i));
                  t++;
			      k=i;
         }
		 else
			 return 1;
		 }
		 //System.out.print(t+" "+s1.length());
        if(t==s1.length()-1)
		{
			System.out.print(k+" "+j);
		}
		return 1;
	 
 }
		
public static void main (String[] args) {
		String s="welcometozohocorporation";
		String s1="too";
		int k=0;
		char a[][]=new char[5][5];
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<5;j++)
		    {
		       if(k<s.length())
		       {
		        a[i][j]=s.charAt(k);
		        k++;
		       }
		       
		    }
		}
		for(int i=0;i<5;i++){
			
           for(int j=0;j<5;j++)
		   {
			   
     if(s1.charAt(0)==(a[i][j]))
        {
           checklr(s1,a,i,j);
           checktb(s1,a,i,j);
        }
		
	}
}
}
}
