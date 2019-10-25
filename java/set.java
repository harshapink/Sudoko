/* Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even numbe*/
import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int sum=0;
		int count[]=new int[n];
		for(int i=0;i<n;i++)          //INCREMENTING VALUE BASED ON CONDITION
		{
		    sum=0;
		    a[i]=s.nextInt();
		    if(a[i]%2==0)
		    {
		        sum=sum+3;
		    }
		    if(a[i]%4==0 && a[i]%6==0)
		    {
		        sum=sum+4;
		    }
		    if(a[i]/(int)Math.sqrt(a[i])==(int)Math.sqrt(a[i]))
		    {
		        sum=sum+5;
		    }
		    count[i]=sum;
		    
		}
		for(int i=0;i<n;i++)           //SORTING BASED ON COUNT VALUE ASCENDING ORDER
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(count[i]>count[j])
		        {
		            int t=a[i];
		            a[i]=a[j];
		            a[j]=t;
		        }
		        
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    System.out.print("THE VALUES ARE:"+a[i]);
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print("VALUE OF COUNT ARRAY:"+count[i]);
		}
		
		
	}
}
