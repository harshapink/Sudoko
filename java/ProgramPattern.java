/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
public static void main (String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
for(int i=0;i<s1.length();i++)
{
   if(i<=s1.length()/2){
   for(int j=0;j<i;j++)
   {
       System.out.print(" ");
   }
   }
   else{
       for(int j=s1.length();j>i+1;j--)
       {
           System.out.print(" ");
       }
   }
           System.out.print(s1.charAt(i));


       
   for(int j=s1.length();j>(i*2)+2;j--)                                                                                                                                                                              
   {
   
       System.out.print(" ");
   }
       
   if(i==s1.length()/2)
   {
       System.out.println("");
   }
   else{
       if(i<=s1.length()/2){
           System.out.println(s1.charAt(i));
       }
       else{
           for(int j=i;j>i-(i-2)+1;j--)                                                                                                                                                                              
               {
   
               System.out.print("  ");
              }
           System.out.println(s1.charAt(i));
       }
      
   }

}
/*	for(int i=s1.length()-1;i>=0;i--)
{
   
   for(int j=0;j<i;j++)
   {
       System.out.print(" ");
   }
           System.out.println(s1.charAt(i));

}

for(int i=s1.length()-1;i>=0;i--)
{
   
   for(int j=0;j<s1.length()-i;j++)
   {
       System.out.print(" ");
   }
           System.out.println(s1.charAt(i));

}*/

}
}
