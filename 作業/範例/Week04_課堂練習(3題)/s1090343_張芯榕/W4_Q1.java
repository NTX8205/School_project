/* Q1: �T���X��
 * ��n�ӤH�򦨤@��A���ǱƸ��]�q1���s��n ���^�A�q�Ĥ@�ӤH�}�l���ơ]�q1��3���ơ^
 * �Z����3���H�X���h�X��l�A�ݳ̫�d�U���O�ĴX��
 * 
 * ��ޤGA / 410903432 / �i��_
 * */

import java.util.*;

public class W4_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// �ϥΪ̿�J
		System.out.println("�п�J�@�ӥ���� n�A�M�w���h�֤H�n�Ӷi��C��");
		int n = sc.nextInt();	
		int[] people = new int[n];
		
		// �}�l�C��
		int count = 0, sum = n;		// count�����ơAsum���`�H��
		while(sum != 1)
		{
			for(int i = 0; i < people.length; i++)
			{
				if(people[i] == 0)
				{
					count++;
					if(count == 3)
					{
						count = 0;
						people[i] = -1;
						sum--; 
					}
				}
			}
		}
		
		for(int k = 0; k < people.length; k++)
		{
			if(people[k] == 0)
				System.out.println(k+1);
		}
		
	}
}
