/* W4_Q1_0316
 * Q1:三號出局
 * 班級:資管二B 學號:410917847 姓名:李昀瑄
 * 期限:111/3/22
 */

import java.util.*;

public class W4_Q1 
{
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//n >= 5
		int arr[] = new int[n];
		int live = n;
		int count = 0;
		int out = -1;
		while(live > 1) 
		{
			for(int i = 0;i < n;i++) 
			 {
				if(arr[i] != out) 
				{
					count++;
					if(count == 3) 
					{
						arr[i] = out;
						live--;
						//System.out.printf("第%d次出局的是: %d 號\n",(n - live),(i + 1));
						count = 0;
					}
				}
			}
		}
		for(int i = 0;i < arr.length;i++) 
		{
			if(arr[i] != out) 
			{
				System.out.printf("留下的是: %d 號\n",(i + 1));
			}
		}
	}
}