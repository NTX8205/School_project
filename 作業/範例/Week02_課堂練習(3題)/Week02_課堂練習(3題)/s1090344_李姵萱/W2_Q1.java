/*Q1: [p,q]區間質數問題*/
//資管二B 410903440 李姵萱

import java.util.*;

public class W2_Q1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int p = sc.nextInt(), q = sc.nextInt();

		int temp = p;
		p = q;
		q = temp;

		for (int i = p; i <= q; i++) 
		{
			int a = 2;
			// 判斷是否為質數
			for (int n = 2; n < i; n++) 
			{
				// 不能整除時,a與i增加量相同
				if ((i % n) != 0) 
				{
					a++;
				}
			}
			if (a == i) 
			{
				b++;
				// 輸出質數
				System.out.print(i + " ");
			}
		}

		System.out.println("\n共有" + b + "個質數");
	}

}