/*Given a two dimensional array of string like
  <”luke”, “shaw”>
  <”wayne”, “rooney”>
  <”rooney”, “ronaldo”>
  <”shaw”, “rooney”> Where the first string is “child”, second string is “Father”. 
And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.*/
import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k1=0,k2=0,count=0;
	String s1=s.next();
	String s2="";
	String a1[]=new String[n];
	String a2[]=new String[n];
	String a[][]=new String[n][2];
	for(int i=0;i<n;i++)  //2D TO 1D ARRAY
	{
	    for(int j=0;j<2;j++)
	    {
	        a[i][j]=s.next();
	        if(j==0)
	        { 
	            if(k1<n)
	            a1[k1++]=a[i][j];
	        }
	        else{
	            if(k2<n)
	            a2[k2++]=a[i][j];
	        }
	    }
	}
	
	for(int i=0;i<n;i++)   //CHECKING FOR PARENT
	
	{
	    if(a2[i].equals(s1))
	    {
	        s2=a1[i];
	    }
	}
	for(int i=0;i<n;i++)   //CHECKING FOR GRANDCHILDREN
	{
	   if(a2[i].equals(s2))
	   {
	       count++;
	   }
	}
	System.out.println(count);
	
	
	}
}
