/*WANT TO PRINT ODD LENGTH STRING  IN THE FORM OF X*/

import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(i==j)
				{
					System.out.print(s1.charAt(i));
				}
				else if(i+j==s1.length()-1 && i!=j)
				{
					System.out.print(s1.charAt(j));
				}
				else{
					System.out.print(" ");
				}

			}
			System.out.println();
		}
			
	}
}
 
