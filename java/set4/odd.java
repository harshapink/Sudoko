/*To find the odd numbers in between the range.
Input:
2
15
Output:
3,5,7,9,11,13*/

import java.util.*;

public class C{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int n1=s.nextInt();
	for(int i=n;i<n1;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
}
}
