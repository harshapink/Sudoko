import java.util.*;
class B
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
    int n=5;
	int val=1;
	int val1=1;
	int l=0;
	for(int i=0;i<n;i++)
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		l=val;
		for(int k=1;k<=val1;k++)
		{
			System.out.print(Math.abs(k-val));
			
		}
		val++;
		val1=val1+2;
		System.out.println();
	}
	}
	
}

	
