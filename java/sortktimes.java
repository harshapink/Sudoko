import java.util.*;
class B
{
	static void change(int[] a ,int i ,int j )
	{
    while(i<=j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
		
		
	}
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
    int a[]={1,2,3,4,5,6,7,8};
	int n=a.length;
int i =0;
while(i<n){
int l = (i + 3) <= n ?(i+3) : n;
change(a,i,l-1);
i=i+3;
}
for(int j=0;j<n;j++)
{
	System.out.print(a[j]);
}
	
	}
	
}

	
