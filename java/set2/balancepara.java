import java.util.*;
class D
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int count[]=new int[3];
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='(')
			{
				count[0]++;
			}
			else if(s1.charAt(i)=='{')
				{
					count[1]++;
				}
				else if(s1.charAt(i)=='[')
				{
					count[2]++;
				}
				else if(s1.charAt(i)==']')
				{
					count[2]--;
				}
			else if(s1.charAt(i)=='}')
				{
					count[1]--;
				}
				else if(s1.charAt(i)==')')
				{
					count[0]--;
				}
		}
		int f=0;
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				f=1;
			}
		}
		if(f==1)
			System.out.println("Unbalanced");
		else
			System.out.println("balanced");
	}
}
