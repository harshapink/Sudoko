/*Write a program to give the following output for the given input

Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99. */
import java.util.*;
import java.io.*;

class GFG {
    static void print(String s1,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(s1);
        }
    }
public static void main (String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
int n=0;
        String s2="";
        int count=0;
for(int i=0;i<s1.length();i++)
{
   if((int)s1.charAt(i)>=97 &&(int)s1.charAt(i)<=122 )
   {
     
      if(count==1)
      {
          print(s2,n);
          s2="";
          count=0;
      }
           s2=s2+s1.charAt(i);
           count++;
           n=0 ;
       
       
       
   }
   else{
       if(n>0)
       {
       n=n*10+Integer.parseInt(s1.charAt(i)+"");
       }
       else{
           n=n+Integer.parseInt(s1.charAt(i)+"");
       }
       if(i==s1.length()-1)
       {
           print(s2,n);
       }
   }
}
}
}


