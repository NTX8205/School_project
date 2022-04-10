/* Q1: 三號出局 */
//資管二Ａ 410917685 卓妤柔

import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個正整數: ");
		int n = sc.nextInt();
		int[] arr = new int[n];//輸入資料
		int num = 1;
		int countnum = n;//陣列元素個數
		int count = 1;
		
		for(int i=0; i<n; i++) 
		{
			arr[i] = num;
			num++;
		}
		
		for(int i=0; i<n; i++) 
		{
			if(arr[i] != 0)
				if(count == 3) {	//3號值設為0
					arr[i] = 0;
					count = 1;
					countnum--;
				}else {
					count++;
				}
			
			if(countnum == 1) 
			{		//不為0的元素剩1
				for(int j=0; j<n; j++)
					if(arr[j] != 0)
						countnum = arr[j];
				break;
			}
			
			if(i == n-1)	//當元素跑到最後一個
				i = -1;
		}
		
		System.out.print(countnum);
	}
}
