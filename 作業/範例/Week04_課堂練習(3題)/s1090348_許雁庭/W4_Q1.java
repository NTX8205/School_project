/*
Q1�G�T���X���G��n�ӤH�򦨤@��A���ǱƸ��]�q1���s��n ���^�C
         �q�Ĥ@�ӤH�}�l���ơ]�q1��3���ơ^�A�Z����3���H�X���h�X��l�A�ݳ̫�d�U���O�ĴX���C
��ޤGB/410903482/�\���x
*/

import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		System.out.println("�п�J�H�ơG");
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		int allcount = n;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = 1;
		}
		while(allcount != 1)
		{
			for(int i = 0 ; i < a.length ; i++)
			{
				if(a[i] == 1)
					count++;
					if(count == 3)
					{
						count = 0;
						a[i] = 0;
						allcount--;
					}
			}
		}
			for(int j = 0 ; j < a.length ; j++)
			{
				if(a[j] == 1)
					System.out.println("�̫�d�U���O��" + (j+1) + "��");
			}
		
	}
}
