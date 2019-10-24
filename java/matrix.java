/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
   static int checksubstring(char a[][])
    {
        int s1=0,s2=0,e1=0,e2=0;
        for(int i=0;i<5;i++)
		{
		    for(int j=0;j<5;j++)
		    {
		        if(a[i][j]=='t')
		        {
		            s1=i;
		            s2=j;
		            if(a[i][j+1]=='o' && a[i][j+2]=='o')
		            {
		                e1=i;
		                e2=j+2;
		                System.out.println("("+s1+","+s2+")"+"("+e1+","+e2+")");
		                return 1;
		            }
		            
		            else if( a[i][j-1]=='o' && a[i][j-2]=='o')
		            {
		                    e1=i;
		                    e2=j-2;
		                    System.out.println("("+s1+","+s2+")"+"("+e1+","+e2+")");
		                    return 1;
		            }
		            else if(a[i+1][j]=='o' && a[i+2][j]=='o')
		            {
		                    e1=i+2;
		                    e2=j;
		                    System.out.println("("+s1+","+s2+")"+"("+e1+","+e2+")");
		                    return 1;
		            }
		           else if(a[i-1][j]=='o' && a[i-2][j]=='o')
		           {
		                        e1=i-2;
		                        e2=j;
		                        System.out.println("("+s1+","+s2+")"+"("+e1+","+e2+")");
		                       return 1;
		                        
		           }
		           
		        }
		    }
    }
    return 0;
    }
	public static void main (String[] args) {
		String s="welcometozohocorporation";
		int k=0;
		int f=0;
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
		f=checksubstring(a);
		if(f==1)
		{
		    System.out.println("String found");
		}
		else{
		    System.out.println("String not found");
		}
		
		
	}
}
