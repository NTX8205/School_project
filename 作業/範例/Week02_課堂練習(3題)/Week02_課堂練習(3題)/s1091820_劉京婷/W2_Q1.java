/*
  	日期:2022/03/02
 	題目:1.[p,q]區間質數問題
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */

import java.util.*;
public class W2_Q1 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入兩個正整數");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int tmp,count=0,sum=0;
		
		if(p>q) 
		{
			tmp=p;
			p=q;
			q=tmp;
		}
		
		for(int i=p;i<=q;i++) 
		{
			count=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) 
				{
					count++;	
				}
			}
			if(count==2) 
			{
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("質數個數:"+sum);
	}
}
