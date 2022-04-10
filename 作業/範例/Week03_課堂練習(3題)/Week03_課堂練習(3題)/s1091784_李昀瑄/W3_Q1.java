/* 
 * W3_0309
 * Q1: 排序次序
 * 
 * 班級 : 資管二B
 * 學號 : 410917847
 * 姓名 : 李昀瑄
 * 日期 : 110/3/12
 */

import java.io.*;
import java.util.*;

public class W3_Q1 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//n要 <= 10
		
		int arr[] = new int[n];
		
		for(int i = 0;i < n; i++) 
		   {
				Random rd = new Random();
				arr[i] = rd.nextInt(100);
		   }
		
		Arrays.sort(arr);
		
		for(int i = 0;i < n ; i++) 
		   {
				System.out.print(arr[i] + " ");
		   }
	}
}
