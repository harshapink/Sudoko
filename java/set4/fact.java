/*To find the factors of the numbers given in an array and to sort the numbers in descending order according to the factors present in it.
Input:
Given array : 8, 2, 3, 12, 16
Output:
12, 16, 8, 2, 3*/

import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int count[]=new int[n];
		int count1=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					count1++;
				}
			}
			count[i]=count1;
			count1=0;
		}
	    for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(count[i]<count[j])
				{
					int t=count[i];
					count[i]=count[j];
					count[j]=t;
					
				  int k=a[i];
				  a[i]=a[j];
				  a[j]=k;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		
		
	}
}
 
