// Q1: �ƧǦ���

// �D�ػ����G�ϥΪ̿�J�@�ӥ���� n�A�䤤 n <= 10
//			�Q�ζü��H�����ͤ@�Ӥ��� 1~100 ������ƨ��x�s��@���}�C��

// ��ޤGA / 410903432 / �i��_

import java.util.Scanner;

public class W3_Q1 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		// �ϥΪ̿�J
		System.out.println("�п�J�@�ӥ���� n�An�Ȭ� 4~6 �䤤�@�ӼƦr");
		int n = sc.nextInt();
		
		while(true)
		{
			if(n < 4 || n > 6)
			{
				System.out.println("��J���~�A�Э��s��J�@�M!");
				System.out.println("�п�J�@�ӥ���� n�An�Ȭ� 4~6 �䤤�@�ӼƦr");
				n = sc.nextInt();
			}
			else 
			{
				int[] arr = new int[n];		// �x�s�ü�
				int[] arr2 = new int[n];	// �x�s�Ѥp��j�Ƨǫ᪺�ü�
				int[] num = new int[n];		// �x�s�üƪ��ƧǦ���
				
				//���Ͷü�
				for(int i = 0; i < arr.length; i++)		
					arr[i] = (int)(Math.random()*100+1);
				
				// ��X�Ƨǫe�}�C
				System.out.print("���]�H�����ͪ��|�ӥ���Ƥ��O�� ");
				for(int i = 0; i < arr.length; i++)
					System.out.print(arr[i]+" ");
				System.out.println();
				
				// �ƻsarr��arr2
				for(int i = 0; i < arr.length; i++)		
					arr2[i] = arr[i];
				
				// �}�l�Ƨ�
				int temp;
				for(int i = 0; i < arr2.length; i++)		// i=1, run*3 
				{
					for(int j = 0; j < arr2.length-i-1; j++)		// j=0, run*2
					{
						if(arr2[j] > arr2[j+1])
						{
							temp = arr2[j];
							arr2[j] = arr2[j+1];
							arr2[j+1] = temp;
						}
					}
				}
				
				// ��X�Ƨǫe�}�C
				//for(int i = 0; i < arr2.length; i++)
				//	System.out.print(arr2[i]+" ");
				//System.out.println();
				
				// �}�l�T�{�ƧǦ���
				int k = 1, count = 0;
				for(int i = 0; i < arr2.length; i++)	
				{
					for(int j = 0; j < arr.length; j++)	
					{
						if(arr2[i] == arr[j] && count < 1 && num[j] == 0)
						{
							num[j] = k;
							count++;
							k++;
						}
						if(arr2[i] == arr[j] && count >= 1 && num[j] == 0)
						{
							k--;
							num[j] = k;
							count++;
							k++;
						}
					}
					count = 0;
				}
				
				// ��X�Ƨǫ�}�C
				System.out.print("�o�|�Ӿ�Ʀb�Ƨǫ᪺���ަ��Ǭ� ");
				for(int i = 0; i < num.length; i++)
					System.out.print(num[i]+" ");
				break;
			}
		}
	}
}
