/*
  	日期:2022/03/02
 	題目:3.質因數分解進階版
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */

import java.util.*;
public class W2_Q3 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個整數");
		int n=sc.nextInt();
		int sum=0;
		
		System.out.print(n+"=");
		for(int i=2;;) 
		{
			if(n%i==0) 
			{
				sum++;
				n=n/i;
			}
			else 
			{
				if(sum>1) 
				{
					System.out.print(i+"^"+sum);
				}
				else if(sum==1) 
				{
					System.out.print(i);
				}
				else if(sum==0)
				{
					i++;
					continue;
				}
				sum=0;
				i++;
				if(n!=1) 
				{
					System.out.print("*");
				}else 
				{
					break;
				}
			}
		}
	}
}
