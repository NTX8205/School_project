/* 
 * W2_0302
 * Q1: [p,q]區間質數問題
 * 
 * 班級 : 資管二B
 * 學號 : 410917847
 * 姓名 : 李昀瑄
 * 日期 : 110/3/2
 */
import java.io.*;
import java.util.*;

public class W2_Q1 {
	public static boolean Num(int n) 
	{
		if(n % 2 == 0) 
		{
			return n == 2;
		}else if(n > 2) 
		{
			for(int i = 3;i < n;i+=2) 
			{
				if(n % i == 0) 
				{
					return false;
				}
			}
			return true;
		}else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int sum = 0;
		
		if(p > q) 
		{
			int a = p;
			p = q;
			q = a;
		}
		for(int i = p;i < q;i++) 
		{
			if(Num(i)) 
			{
				System.out.print(i + " ");
				sum += 1;
			}
		}
		System.out.println("\n質數個數" + sum);
	}
}
