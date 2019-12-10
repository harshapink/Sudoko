import java.io.*;
import java.util.*;
class GFG {
    static void Map(HashMap<Integer,Integer> m,int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(m.containsKey(a[i]))
            {
                m.put(a[i],m.get(a[i])+1);
            }
            else{
                m.put(a[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : m.entrySet()) 
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }
    } 
	public static void main (String[] args) {
	     ArrayList<Integer> al=new ArrayList<Integer>();
	     HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	     int a[]={1,2,3,4,2,1};
	     Map(m,a);
	     al.add(1);
	     al.add(2);
	     al.add(3);
	     al.add(2);
	     al.add(1);
	     al.add(4);
	     Arraylist(al);
	     
	}	
    
}
