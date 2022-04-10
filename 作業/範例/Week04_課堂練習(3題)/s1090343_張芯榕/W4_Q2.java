/* Q2: 前段和與後段和
 * 
 * 假設有一個陣列x[]，它有n個元素，每一個都大於零；
 * 我們說x[0]+x[1]+...+x[i]是個前段和(Prefix Sum)，
 * 而x[ j]+x[ j+1]+...+x[n-1]則是個後段和(Suffix Sum)
 * 請寫一個程式，求出x[]中有多少組相同的前段和與後段和
 * 
 * 資管二A / 410903432 / 張芯榕
 * */

import java.util.*;

public class W4_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// 使用者輸入
		System.out.println("請輸入一個正整數 n 來決定要輸入幾筆資料");
		int n = sc.nextInt();	
		int[] arr = new int[n];
		System.out.printf("請連續輸入%d個正整數，並用空格隔開%n", n);
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		// 算前段和
		int[] front = new int[n];
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			front[i] = sum;
		}
		
		// 算後段和
		int[] end = new int[n];
		sum = 0;
		for(int i = arr.length-1, j = 0; i >= 0; i--, j++)
		{
			sum += arr[i];
			end[j] = sum;
		}
		
		// 尋找陣列中有多少組相同的前段和與後段和
		int count = 0;
		for(int i = 0; i < front.length; i++)
			for(int j = 0; j < end.length; j++)
				if(front[i] == end[j])
					count++;
		
		System.out.println(count);
	}
}
