//Q1: [p,q]�϶���ư��D�A�ϥΪ̿�J��ӥ����p, q, ��X����p��q�������Ҧ���ƻP����`��
//��ޤGB/410903482/�\���x

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
		
		System.out.printf("%n��ƭӼơG" + count);
	}

}
