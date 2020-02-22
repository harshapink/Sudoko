import java.util.*;
import java.io.*;

class A {	
       
static void alpha(String str,int n)
{
	HashMap<Integer,String> m=new HashMap<Integer,String>();
	int count=1;
	for (char ch = 'A'; ch <= 'Z'; ++ch) 
       m.put(count++,String.valueOf(ch));
     if(n == 0)
	 {
        System.out.println(str);
        return;
	 }
	 else
	 {
		String dnum = n+"";
    
    String sNum = dnum.substring(0,1);
    
    int singleNum = Integer.parseInt(sNum);
    
    if(singleNum > 0 )
    {
        String onechar = m.get(singleNum);
        int remaining = !dnum.substring(1).isEmpty() ? Integer.parseInt(dnum.substring(1)): 0 ;
        alpha( str+onechar, remaining);
    }
    
    dnum = n+"";
    if(dnum.length()>=2)
    {
          String donum=dnum.substring(0,2);
          int doublenum=Integer.parseInt(donum);
          if(doublenum<=26)
          {
            String doublechar=m.get(doublenum);
            int remaining = !dnum.substring(2).isEmpty() ? Integer.parseInt(dnum.substring(2)) : 0 ;
            alpha( str+doublechar, remaining);
           }
     }
	 }
	
    
}
    
public static void main (String[] args) {
		int n=123;
		alpha("",n);
		
}
}








