/* Q1: 前段和與後段和 */
//資管二Ａ 410917685 卓妤柔

import java.util.*;
public class W4_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個正整數:");
		int n = sc.nextInt();
		int[] arr = new int[n];//輸入資料
		int[] front = new int[n];//前段和陣列
		int[] back = new int[n];//後段和陣列
		int count = 0;
		
		System.out.printf("請輸入%d個正整數",n);
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		for(int i=0; i<n; i++)		//前段和
			if(i == 0) 
				front[i] = arr[i];
			else
				front[i] = arr[i] + front[i-1];
		
		for(int i=0; i<n; i++)		//後段和
			if(i == 0) 
				back[i] = arr[n-1];
			else
				back[i] = back[i-1] + arr[n-i-1];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				if(front[i] == back[j])
					count++;
		
		System.out.print("前段和與後段和相同的元素共"+count+"個");
	}
}
