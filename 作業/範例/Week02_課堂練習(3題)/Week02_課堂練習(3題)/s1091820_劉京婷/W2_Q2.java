/*
  	日期:2022/03/02
 	題目:2.最接近質數問題
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */

import java.util.*;
public class W2_Q2 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個整數");
		int n=sc.nextInt();
		int count=0,min=1,max=n+1;
		
		System.out.printf("最接近%d的質數:",n);
		int i=0;
		
		while(i<n) 
		{
			for(int j=1;j<n;j++) 
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				min=i;
			}
			i++;
			count=0;
		}
	
		while(max>n) 
		{
			count=0;
			for(int j=1;j<=max;j++) 
			{
				if(max%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				break;
			}
			max++;
		}

		if(n-min>max-n) 
		{
			System.out.print(max);
		}
		else if(n-min<max-n)
		{
			System.out.print(min);
		}
		else 
		{
			System.out.printf("%d和%d",min,max);
		}
	}
}
