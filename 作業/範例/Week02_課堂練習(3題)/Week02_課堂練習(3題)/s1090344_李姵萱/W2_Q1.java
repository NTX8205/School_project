/*Q1: [p,q]�϶���ư��D*/
//��ޤGB 410903440 ���r��

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
			// �P�_�O�_�����
			for (int n = 2; n < i; n++) 
			{
				// ����㰣��,a�Pi�W�[�q�ۦP
				if ((i % n) != 0) 
				{
					a++;
				}
			}
			if (a == i) 
			{
				b++;
				// ��X���
				System.out.print(i + " ");
			}
		}

		System.out.println("\n�@��" + b + "�ӽ��");
	}

}