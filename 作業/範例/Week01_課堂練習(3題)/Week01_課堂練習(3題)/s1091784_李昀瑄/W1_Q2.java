/* 
 * W1_0223
 * Q2: 將使用者輸入的正整進行質因數分解
 * 
 * 班級 : 資管二B
 * 學號 : 410917847
 * 姓名 : 李昀瑄
 * 日期 : 110/2/23
 */

import java.io.*;
import java.util.Scanner;

public class W1_Q2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(n + " = ");
		
		int k = 2;
		while(n > k) 
		{
			if(n % k == 0) 
			{
				System.out.print(k + "*");
				n = n/k;
			}else {
				k++;
			}
		}
		System.out.print(n); 
	}
}