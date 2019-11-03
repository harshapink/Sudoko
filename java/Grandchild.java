/*Given a two dimensional array of string like
  <”luke”, “shaw”>
  <”wayne”, “rooney”>
  <”rooney”, “ronaldo”>
  <”shaw”, “rooney”> Where the first string is “child”, second string is “Father”. 
And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.*/
/*package whatever //do not write package name here */
/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	int n=s.nextInt();  
    String search=s.next();
	HashMap<String, List<String>> m=new HashMap<String, List<String>>();
	List<String> val=new ArrayList<String>();
	for(int i=0;i<n;i++)
	{
		String s1=s.next();
	    String s2=s.next();
		if(m.containsKey(s2))
		{
			val=m.get(s2);
			val.add(s1);
			m.put(s2,val);
			
		}
		else
		{
			val=new ArrayList<String>();
			val.add(s1);
			m.put(s2,val);
		}

	}
	for(Map.Entry<String,List<String>> a: m.entrySet())
	{
	    
	    int key=0;
	       if(a.getKey().equals(search))
	        {
	            List k=a.getValue();
	        
	        for(int i=0;i<k.size();i++)
	        {
	     
	        if(m.containsKey(k.get(i)))
	        {
	            
	            key=key+m.get(k.get(i)).size();
	           
	        }
	    } 
	    System.out.print(key);
	}
	}
	        }
	    }
