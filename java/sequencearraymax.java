import java.util.*;
import java.io.*;

public class A {   
static int[] print(int a[],int m)
{
    int s=0,e=0,ma=0;
    int max[]=new int[3];
    for(int i=0;i<m;i++)
    {
        int count=1;
        for(int j=i;j<m-1;j++)
        {
            if(a[j]<a[j+1])
            {
                count=count+1;
            }
            else
            {
                count=-1;
                break;
            }
        }
        if(count !=-1 ){
           ma = count > ma ? count : ma;
           max[0] =ma;
           max[1] =i;
           max[2] =m;
        }
        
    }
    return max;
}
public static void main (String[] args) {
int a[]={7,6,3,4,1};
int s=0;
int e=0,m=0;
for(int i=0;i<a.length;i++)
{
    int max[]=print(a,i+1);
    if(max[0]>m)
    {
     s=max[1];
     e=max[2];
     m=max[0];
     }
     
     
    
}
System.out.println(s+"  "+e+" "+m);
}
}
