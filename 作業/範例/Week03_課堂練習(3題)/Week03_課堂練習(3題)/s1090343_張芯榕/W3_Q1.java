// Q1: 排序次序

// 題目說明：使用者輸入一個正整數 n，其中 n <= 10
//			利用亂數隨機產生一個介於 1~100 的正整數並儲存到一維陣列中

// 資管二A / 410903432 / 張芯榕

import java.util.Scanner;

public class W3_Q1 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		// 使用者輸入
		System.out.println("請輸入一個正整數 n，n值為 4~6 其中一個數字");
		int n = sc.nextInt();
		
		while(true)
		{
			if(n < 4 || n > 6)
			{
				System.out.println("輸入錯誤，請重新輸入一遍!");
				System.out.println("請輸入一個正整數 n，n值為 4~6 其中一個數字");
				n = sc.nextInt();
			}
			else 
			{
				int[] arr = new int[n];		// 儲存亂數
				int[] arr2 = new int[n];	// 儲存由小到大排序後的亂數
				int[] num = new int[n];		// 儲存亂數的排序次序
				
				//產生亂數
				for(int i = 0; i < arr.length; i++)		
					arr[i] = (int)(Math.random()*100+1);
				
				// 輸出排序前陣列
				System.out.print("假設隨機產生的四個正整數分別為 ");
				for(int i = 0; i < arr.length; i++)
					System.out.print(arr[i]+" ");
				System.out.println();
				
				// 複製arr到arr2
				for(int i = 0; i < arr.length; i++)		
					arr2[i] = arr[i];
				
				// 開始排序
				int temp;
				for(int i = 0; i < arr2.length; i++)		// i=1, run*3 
				{
					for(int j = 0; j < arr2.length-i-1; j++)		// j=0, run*2
					{
						if(arr2[j] > arr2[j+1])
						{
							temp = arr2[j];
							arr2[j] = arr2[j+1];
							arr2[j+1] = temp;
						}
					}
				}
				
				// 輸出排序前陣列
				//for(int i = 0; i < arr2.length; i++)
				//	System.out.print(arr2[i]+" ");
				//System.out.println();
				
				// 開始確認排序次序
				int k = 1, count = 0;
				for(int i = 0; i < arr2.length; i++)	
				{
					for(int j = 0; j < arr.length; j++)	
					{
						if(arr2[i] == arr[j] && count < 1 && num[j] == 0)
						{
							num[j] = k;
							count++;
							k++;
						}
						if(arr2[i] == arr[j] && count >= 1 && num[j] == 0)
						{
							k--;
							num[j] = k;
							count++;
							k++;
						}
					}
					count = 0;
				}
				
				// 輸出排序後陣列
				System.out.print("這四個整數在排序後的索引次序為 ");
				for(int i = 0; i < num.length; i++)
					System.out.print(num[i]+" ");
				break;
			}
		}
	}
}
