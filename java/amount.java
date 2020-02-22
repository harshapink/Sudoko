import java.util.*;
import java.io.*;

public class A {   
       static void word(char[] a)
       {
           int n=a.length;
           int t=0;
String[] s = new String[]{ "zero", "one",  
                                        "two", "three", "four", 
                                        "five", "six", "seven",  
                                            "eight", "nine"}; 
String[] tl= new String[]{ "ten", "eleven", "twelve",  
                                        "thirteen", "fourteen", 
                                        "fifteen", "sixteen", "seventeen", 
                                        "eighteen", "nineteen"}; 
String[] te= new String[]{"", "", "twenty", "thirty", "forty",  
                                            "fifty","sixty", "seventy",  
                                            "eighty", "ninety"}; 
String[] tp= new String[] {"hundred", "thousand"}; 

String str ;

int flag = 0;
if(n>=5)
{

    if(a[t]-'0'==1)
        {
            
            System.out.print(" "+tl[a[t+1]-'0']);
            flag =1;
        }
        else{
            System.out.print(" "+te[a[t]-'0']+" ");
        }
    
    str = new String(a); // 
    str = str.substring(1); // 
    a = str.toCharArray(); // 1000
}
if(n>=4)
{
    if( flag == 0 )
    {
        System.out.print(tl[a[t]-'0'] + "  Thousand ");
    } 
    else {
        System.out.print(" Thousand ");
    }

    if(a[t+1] - '0' > 0 || a[t+2] - '0' >0 || a[t+3] - '0' >0  )
    {
        System.out.print(" and ");
    }
    
    str = new String(a); // 
    str = str.substring(1); // 
    a = str.toCharArray(); //
}

if(n>=3)
{

    System.out.print(s[a[t]-'0'] + "  hundred "); // 

    if(a[t+1] - '0' > 0 || a[t+2] - '0' >0 )
    {
        System.out.print(" and ");
    }
    
    str = new String(a); // 
    str = str.substring(1); // 
    a = str.toCharArray(); // 
    
}
if(n>=2)
{
    if( a[t]- '0' > 0  )
    {
        if(a[t]-'0'==1)
        {
            System.out.print(" "+tl[a[t+1]-'0']);
            return;
        }
        else{
            System.out.print(" "+te[a[t]-'0']+" ");
        }
    }
    
    str = new String(a); // "23"
    str = str.substring(1); // "3"
    a = str.toCharArray(); // ['3']
 
       
}
if(n>=1)
{
    if(a[t]-'0'>0)
    {
        System.out.print(s[a[t]-'0']);
    }
}



}
    
public static void main (String[] args) {

        word((Integer.parseInt("1105")+"").toCharArray()); 
}
}
