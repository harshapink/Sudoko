/*A man his driving car from home to office with X petrol. There are N number of petrol bunks in the city with only few capacities and each petrol is located in different places For one km one liter will consume. So he fill up petrol in his petrol tank in each petrol bunks. Output the remaining petrol if he has or tell him that he cannot travel if he is out of petrol.
Input:
Petrol in car: 2 Liters
Petrol bunks: A B C
Distance from petrol each petrol bunks: 1, 5, 3
Capacities of each petrol bunk: 6, 4, 2
Output:
Remaining petrol in car is 5 liters*/


import java.util.*;
class A
{
	static int petrol(int p,int d,int quan)
	{
		if(p>=d)
			{
			p=p-d;
			p=p+quan;
			}
			else
			{
				System.out.println("cannot move");
				return 1;
			}
			return p;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int dis=s.nextInt();
		int p=s.nextInt();
		int t=0;
		for(int i=0;i<dis;i++)
		{
			int d=s.nextInt();
			int quan=s.nextInt();
			 t=petrol(p,d,quan);
			 p=t;
			 if(t==1)
			 {
				 break;
			 }
		}
		System.out.println("quantity of petrol remains:"+t);
			
			
		
	}
}
 
