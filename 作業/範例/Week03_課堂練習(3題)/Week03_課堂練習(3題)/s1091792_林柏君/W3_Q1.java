/*
 * 班級：資管二B
 * 學號：410917928
 * 姓名：林柏君
 * 題目：W3_Q1排序次序
 */

import java.util.*;

public class W3_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//把數值輸入進array裡
		System.out.println("請輸入小於10的數：");
		int n = sc.nextInt();
		int arr[] = new int[n];
		

		if(n>=10)
		{
			System.out.println("錯誤！請輸入小於10的數！");
		}
		else
		{	
			////
			
			//隨機數字進arr
			System.out.print("陣列一arr： ");
			for (int i=0; i<n; i++)
			{
				arr[i]= (int)(Math.random()*100);
				System.out.print(arr[i]+" ");
			}
			
			
			//把arr複製到ans裡，再排序ans
			System.out.println();
			System.out.print("陣列二ans： ");
			
			int ans[] = Arrays.copyOf(arr, n);
			Arrays.sort(ans);
			for (int i=0; i<n; i++)
			{
				System.out.print(ans[i]+" ");
			}
			
			//把排序後的ans和arr對比
			for (int i=0; i<n;i++)
			{
				for (int j=0; j<n; j++)
				{
					if (ans[j]==arr[i])
					{
						arr[i] = j+1;  //array都是從0開始，但題目要求從1開始
					}
				}
			}
			
			System.out.println();
			System.out.print("答案： ");

			//輸出arr
			for (int i=0; i<n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		

		}
		
			////
			
	}
}
