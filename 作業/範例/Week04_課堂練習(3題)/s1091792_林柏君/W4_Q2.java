/*
 * 班級：資管二B
 * 學號：410917928
 * 姓名：林柏君
 * 題目：W4_Q2 前段和與後段和
 * 日期：2022/03/16
 */
import java.util.*;

public class W4_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入n：");
		int n = sc.nextInt();
		System.out.print("請輸入"+ n + "個整數：");
		
		////
		int arr[] = new int[n];
		for (int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			//System.out.print(arr[i]);
		}
		System.out.print("輸入數：");
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}

		
		System.out.println();
		
		//前段arrf
		int arrf[] = new int[n];
		int sumf = 0;
		System.out.print("前段和：");
		for (int i=0; i<n; i++)
		{
			arrf[i] = sumf+arr[i];
			sumf += arr[i];
			System.out.print(arrf[i]+" ");
		}
		
		System.out.println();
		
		//後段arrb
		int arrb[] = new int[n];
		int sumb = 0;
		System.out.print("後段和：");
		for (int i=n-1; i>=0; i--)
		{
			arrb[i] = sumb+arr[i];
			sumb += arr[i];
			System.out.print(arrb[i]+" ");
		}
		
		/* 實際上的arrb長這樣
		for (int i=0; i<n; i++)
		{
			System.out.print(arrb[i]+" ");
		}
		*/
		
		//對比
		int count = 0;  //總共多少個一樣
		for (int i=0; i<n; i++)
		{
			for (int j=n-1; j>=0; j--)  //因為arrb是倒過來放的
			{
				if (arrf[i]==arrb[j])
				{
					count++;
				}
			}
		}
		System.out.println();
		System.out.print(count);

		////
		
	}

}
