/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class D {
public static void main (String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String news="";
String s2[]=s1.split(" ");                                                 
 for(int i=s2.length-1;i>=0;i--)
 {
	 
	 news=news+s2[i]+" ";
 }
 System.out.print(news);
}
}
