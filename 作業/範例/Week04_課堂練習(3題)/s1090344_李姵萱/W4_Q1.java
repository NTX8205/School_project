/*Q1: �T���X��*/
//��ޤGB 410903440 ���r��

import java.util.Scanner;

public class W4_Q1 
{
	public static void main(String[] args) 
	{
		System.out.print("�п�J�@�Ӥj��ε���5����ơG");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] people = new int[n];
		int remain = n; // �٦s���۪�
		int count = 0; // ����
		int out = -1;// �X��
		
		while (remain > 1) 
		{
			for (int i = 0; i < n; i++) 
			{
				if (people[i] != out) 
				{
					count++;
					if (count == 3) 
					{
						count = 0;
						remain--;
						people[i] = out;
						
						System.out.println("�X�����O" + (i + 1));
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) 
		{
			if (people[i] != out) 
			{
				System.out.println("�d�U�Ӫ��O" + (i + 1) + "��");
			}
		}
	}
}