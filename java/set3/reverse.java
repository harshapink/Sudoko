/*package whatever //do not write package name here */
/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
public static void main (String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String news="";
int count=0; 
/*String s2[]=s1.split(" ");                                                 
 for(int i=s2.length-1;i>=0;i--)
 {
	 
	 news=news+s2[i]+" ";
 }*/
 for(int i=0;i<s1.length();i++)
 {
     if(s1.charAt(i)==' ')
     {
         count++;
     }
 }
 String a[]=new String[count+1];
 for(int i=0;i<s1.length();i++)
 {
     if(s1.charAt(i)!=' ')
     {
         news=news+s1.charAt(i);
         if(i==s1.length()-1)
         {
             a[count]=news;
         }
        
     }
        else{
            a[count]=news;
            --count;
            news="";
        }
        
              
 }
 for(int i=0;i<a.length;i++)
 {
 System.out.print(a[i]+" ");
 }
}
}
