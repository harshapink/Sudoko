import java.util.*;
import java.io.*;

class A {	

static void sort(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		
			System.out.print(a[i]);
		
	}
}
static void sortprint(int a[])
{
	int i=0;
	int j=a.length-1;
	while(i<j)
	{
		System.out.print(a[j]);
		System.out.print(a[i]);
		j--;
		i++;
	}
	if(a.length%2!=0)
	{
		System.out.print(a[(a.length%2)+1]);
	}
}
public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=5;
		int a[]={5,4,3,2,1};
		sort(a);
		sortprint(a);
}
}








