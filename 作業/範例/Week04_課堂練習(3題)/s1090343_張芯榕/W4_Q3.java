// Q3: 圓括號對應
// 資管二A / 410903432 / 張芯榕

// (a+(b*c)/(d-e)+f)
// ((a+b)-c*e)+(e*(f-g)

import java.util.*;

public class W4_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// 使用者輸入
		System.out.println("請輸入一個包含圓括號的字串");
		String s = sc.next();
		char[] c = s.toCharArray();
		
		int min;
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] == ')')
			{
				for(int j = i-1; j >= 0; j--)
				{
					if(c[j] == '(')
					{
						System.out.printf("%d,%d%n", j, i);
						c[j] = 'a';
						c[i] = 'a';
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] == '(')
				System.out.printf("%d,-1%n", i);
		}
		
	}
}
