/* Q1: 三號出局
 * 有n個人圍成一圈，順序排號（從1號編到n 號），從第一個人開始報數（從1到3報數）
 * 凡報到3的人出局退出圈子，問最後留下的是第幾號
 * 
 * 資管二A / 410903432 / 張芯榕
 * */

import java.util.*;

public class W4_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// 使用者輸入
		System.out.println("請輸入一個正整數 n，決定有多少人要來進行遊戲");
		int n = sc.nextInt();	
		int[] people = new int[n];
		
		// 開始遊戲
		int count = 0, sum = n;		// count為報數，sum為總人數
		while(sum != 1)
		{
			for(int i = 0; i < people.length; i++)
			{
				if(people[i] == 0)
				{
					count++;
					if(count == 3)
					{
						count = 0;
						people[i] = -1;
						sum--; 
					}
				}
			}
		}
		
		for(int k = 0; k < people.length; k++)
		{
			if(people[k] == 0)
				System.out.println(k+1);
		}
		
	}
}
