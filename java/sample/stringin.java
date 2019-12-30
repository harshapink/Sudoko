/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static void sub(String s1,String s2)
    {
        for(int i=0;i<s2.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(s2.charAt(i)==s1.charAt(j))
                {
                    if(s1.substring(j,j+s2.length()).equals(s2))
                    {
                        System.out.print(s1.substring(j,j+s2.length()));
                        return ;
                    }
                    else{
                        System.out.print("not Appeared");
                        return;
                    }
                }
                else{
                    continue;
                }
            }
        }
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String a[]=new String[12];
		String s1="ilike";
		String s2="idontlike";
		String s3="";
		for(int i=0;i<a.length;i++)
		{
		    a[i]=s.next();
		    s3=s3+a[i];

		}
		
			sub(s3,s2);
	}
}
