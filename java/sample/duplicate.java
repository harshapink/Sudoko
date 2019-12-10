/*package whatever //do not write package name here */

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
    static void Arraylist(ArrayList<Integer> al)
    {
        int count=1;
        for(int i=0;i<al.size()-1;i++)
        {
            int k=al.get(i);
            al.remove(al.get(i));
            al=al;
            if(al.contains(k)==true)
            {
                count=0;
            }
            else{
                 al.remove(al.get(i));
            }
            
        }
        System.out.println(al);
        
        
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
	     al.add(4);
	     Arraylist(al);
	     
	} 
	    
	
    
}
