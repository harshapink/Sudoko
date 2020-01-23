/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
    static void perm(char[] ch,int[] count,char[] re,int l)
    {
    if(l==re.length)
    {
        print(re);
        return;
    }

        for(int i=0;i<ch.length;i++)
        {
            if(count[i]==0)
            {
                continue;
            }
            re[l]=ch[i];
            count[i]--;
            perm(ch,count,re,l+1);
            count[i]++;
        }
    }
    static void  print(char[] re)
    {
        for(int i=0;i<re.length;i++)
        {
            System.out.print(re[i]);
        }
        System.out.println();
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String str="AABC";
		Map<Character,Integer> m=new TreeMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
		    if(m.containsKey(str.charAt(i)))
		    {
		        m.put(str.charAt(i),m.get(str.charAt(i))+1);
		    }
		    else{
		        m.put(str.charAt(i),1);
		    }
		}
		int count[]=new int[m.size()];
		char ch[]=new char[m.size()];
		char re[]=new char[m.size()];
		int i=0;
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
		    ch[i]=entry.getKey();
		    count[i]=entry.getValue();
		    	//System.out.println(ch[i]+""+count[i]);
		    	i++;
		}
		perm(ch,count,re,0);
	
	}
}
