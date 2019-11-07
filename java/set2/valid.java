import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();int f=0;
		for(int i=0;i<s1.length();i++)
		{
			try
			{
			if(s1.charAt(i)=='+' || s1.charAt(i)=='-'|| s1.charAt(i)=='*' ||s1.charAt(i)=='/' ||s1.charAt(i)=='%')
			{
				String a=s1.charAt(i-1)+"";
				String b=s1.charAt(i+1)+"";
				f=1;
			}
			else
				System.out.println("Invalid);
			}
		
		catch(Exception e)
		{
			System.out.print("Invalid");
        }
}

if(f==1)
	System.out.print("valid");
}
}
		
