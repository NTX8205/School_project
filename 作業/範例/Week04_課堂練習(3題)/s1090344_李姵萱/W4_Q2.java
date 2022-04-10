/*Q2: 前段和與後段和*/
//資管二B 410903440 李姵萱

import java.util.*;

public class W4_Q2 
{

	public static void main(String[] args) 
	{
		System.out.print("請輸入一個正整數：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int pre = 0, count = 0;
		
		for(int i =0; i<n; i++)
		{
			pre+=a[i];
			int post = 0;
			
			for(int j=n-1; j>=0; j--)
			{
				post+=a[j];
				
				if(pre == post)
				{
					count++;
				}
			}
		}
		
		System.out.printf("前端和雨後端和共有 %d 組相同", count);

	}

}
