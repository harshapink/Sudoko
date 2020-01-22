/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int check(String s1,String s2)
    {
        int n=0, n1=0;
        for(int i=0,j=0;i<s1.length() || j<s2.length();i++,j++)
        {
            while(i<s1.length() && s1.charAt(i)!='.')
            {
                n=n*10+Integer.parseInt(s1.charAt(i)+"");
                i++;
            }
            while(j<s2.length() && s2.charAt(j)!='.')
            {
                n1=n1*10+Integer.parseInt(s2.charAt(j)+"");
                j++;
            }
            if(n>n1)
            {
                System.out.println("VERSION1");
                return 0;
            }
            else if(n1>n)
            {
                System.out.println("VERSION2");
                return 0;
            }
            n=0;
            n1=0;
            
        }
        return 0;
    }
	public static void main (String[] args) {
		String s1="1.01.1";
		String s2="1.1.2";
		int n=check(s1,s2);
		if(n==1)
		{
		    System.out.println("SAME");
		}
	}
}
