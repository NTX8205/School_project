//Q1: [p,q]區間質數問題，使用者輸入兩個正整數p, q, 找出介於p到q之間的所有質數與質數總數
//資管二B/410903482/許雁庭

import java.util.*;
public class W2_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int count = 0 , p = sc.nextInt() , q = sc.nextInt();
		
		if(p > q)
		{
			int tmp = p;
			p = q;
			q = tmp;
		}
		
		for(int i = p+1 ; i < q ; i++)
		{
			boolean k = true;
			
			for(int j = 2 ; j < i ; j++)
			{
				if(i % j == 0)
				{
					k = false;
					break;
				}
			}
			if(k)
			{
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.printf("%n質數個數：" + count);
	}

}
