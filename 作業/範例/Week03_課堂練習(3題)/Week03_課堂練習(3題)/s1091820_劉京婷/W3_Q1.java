/*
 	日期:2022/03/09
 	題目:排序次序
 		(使用者輸入一個正整數n, 其中n<=10. 利用亂數隨機產生n個介於1~100的正整數並儲存到一維陣列中)
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */

import java.util.*;
public class W3_Q1 
{
	public static void main(String args[]) 
	{	System.out.println("請輸入一個正整數");
		Scanner sc=new Scanner(System.in);
		Random rand = new Random();

		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.printf("隨機產生的%d個正整數分別為:",n);
		for(int i=0;i<n;i++) 
		{
			arr[i]= rand.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int a[]=new int[n];
		int s=0;
		
		for(int i=1;i<=n;i++) 
		{
			int min=101;
			for(int j=0;j<n;j++) 
			{
				if(a[j]==0 && min>=arr[j]) 
				{
					min=arr[j];
						s=j;
				}
			}
			a[s]=i;
		}
		System.out.printf("這%d個整數在排序後的索引次序為:",n);
		for(int j=0;j<n;j++) 
		{
			System.out.print(a[j]+" ");
		}
	}
}
