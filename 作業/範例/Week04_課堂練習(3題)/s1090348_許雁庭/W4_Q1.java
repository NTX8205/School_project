/*
Q1：三號出局：有n個人圍成一圈，順序排號（從1號編到n 號）。
         從第一個人開始報數（從1到3報數），凡報到3的人出局退出圈子，問最後留下的是第幾號。
資管二B/410903482/許雁庭
*/

import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		System.out.println("請輸入人數：");
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		int allcount = n;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = 1;
		}
		while(allcount != 1)
		{
			for(int i = 0 ; i < a.length ; i++)
			{
				if(a[i] == 1)
					count++;
					if(count == 3)
					{
						count = 0;
						a[i] = 0;
						allcount--;
					}
			}
		}
			for(int j = 0 ; j < a.length ; j++)
			{
				if(a[j] == 1)
					System.out.println("最後留下的是第" + (j+1) + "號");
			}
		
	}
}
