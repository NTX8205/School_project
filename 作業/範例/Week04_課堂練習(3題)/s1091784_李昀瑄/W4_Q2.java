/* W4_0316
 * Q2:前段和與後段和
 * 班級:資管二B 學號:410917847 姓名:李昀瑄
 * 期限:111/3/22
 */

import java.util.*;

public class W4_Q2 
{
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int [n];
		for(int i = 0;i < n;i++) 
		{
			x[i] = sc.nextInt();
		}
		int a = 0,b = 0,count = 0;
		for(int i = 0;i < x.length;i++) 
		{
			a += x[i];
			b = 0;
			for(int j = n-1;j >= 0;j--) 
			{
				b += x[j];
				if(a == b) 
				{
					count++;
				}
			}
		}
		Num(x);
		System.out.println("有" + count + "組相同的前段和與後段和");
	}
	
	static void Num(int x[]) 
	{
		int a = 0,b = 0;
		for(int i = 0;i < x.length;i++) 
		{
			a += x[i];
			//System.out.print(a + " ");
		}
		System.out.println();
		for(int j = x.length-1;j >= 0;j--) 
		{
			b += x[j];
			//System.out.print(b + " ");
		}
	}
}
