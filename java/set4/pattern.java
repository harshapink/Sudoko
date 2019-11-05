/*To find the print the pattern:Ip: n=5
Op:
1
1 1
2 1
1 2 1 1
1 1 1 2 2 1*/

import java.util.*;
class D
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String s1="";
		String k="11";
		int count=1;int f=0;
		s1=k;
		k="";
		while(n>0)
		{
			
		for(int i=0;i<s1.length();i++)
		{
             if(i+1==s1.length()  && f==1){
				break;
			}
			 else if(i+1==s1.length()  && f!=1|| s1.charAt(i)!=s1.charAt(i+1))
			{
				k=k+count+s1.charAt(i);
				 f=0;
			}
			else if(s1.charAt(i)==s1.charAt(i+1))
			{
				count++;
				f=1;
			}
			
			if(f==1)
			{
			k=k+count+s1.charAt(i);
			}
			count=1;
			
			
		}
		System.out.println(k);
		s1=k;
		k="";
		n--;
		}
		
	}
}
 
