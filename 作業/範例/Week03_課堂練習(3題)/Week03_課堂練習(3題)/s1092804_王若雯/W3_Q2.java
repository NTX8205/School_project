//Q2計算2個正整數的最大公因數(gcd)&最小公倍數(lcm)
//
//系級:資管二A //學號:410928042 //姓名:王若雯
import java.util.*;
public class W3_Q2 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int xx=x,yy=y;
		int gcd=1,lcm=1;
		int x_arr[] = new int [Arr_number(x)];
		int y_arr[] = new int [Arr_number(y)];
		
		for(int i=0;i<x_arr.length;i++) 
		{
			for (int k = 2; x>=2; k++) 
			{
				if (x % k == 0) 
				{
					x_arr[i]=k;
					x /= k;
					break;
				} 
			}
		}	
		for(int j=0;j<y_arr.length;j++) 
		{
			for (int k = 2;y>=2; k++) 
			{
				if (y % k == 0) 
				{
					y_arr[j]=k;
					y /= k;
					break;
				} 
			}
		}
		for (int index=0;index<x_arr.length || index<y_arr.length ;index++) 
		{
			if(x_arr[index]==y_arr[index]) {
				gcd*=x_arr[index];
				lcm*=x_arr[index];
			}
			else if(x_arr[index]!=y_arr[index])
			{
				lcm*=x_arr[index];
				lcm*=y_arr[index];			}
		}
		System.out.printf("%d和%d的gcd=%d %n",xx,yy,gcd);
		System.out.printf("%d和%d的lcm=%d %n",xx,yy,lcm);
	}
	
	public static int Arr_number(int n) {
		int count=0;
		for (int k = 2; k <= n; k++) {
		            while (n >= k) {
		                if (n % k == 0) {
		                    count++;
		                    n /= k;
		                } else {
		                    break;
		                }
		            }
		        }
		return count;
	}
}

