// Q3: ��A������
// ��ޤGA / 410903432 / �i��_

// (a+(b*c)/(d-e)+f)
// ((a+b)-c*e)+(e*(f-g)

import java.util.*;

public class W4_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// �ϥΪ̿�J
		System.out.println("�п�J�@�ӥ]�t��A�����r��");
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
