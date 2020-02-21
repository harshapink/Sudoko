import java.util.*;
import java.io.*;

class A {	

public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a[][]=new int[][]{{1,3,6,10},{2,5,9,13},{4,8,12,15},{7,11,14,16}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		int row=0;
       int col=0;
	   int i=row;
	   int j=col;
for (int k = 0; k <  a.length* a.length;) { 

    for (; i >= 0 && j < a.length; j++, i--) { 
        System.out.print(a[i][j] + " "); 
        k++; 
    } 

    if( j == a.length ){
       col += 1;
       row = a.length-1;
       
    } else
    
    {
        col=0;
        row+=1;
    
    }

     i = row ;
     j = col ;

} 
		
}
}








