/*
 * �Z�šG��ޤGB
 * �Ǹ��G410917928
 * �m�W�G�L�f�g
 * �D�ءGW3_Q1�ƧǦ���
 */

import java.util.*;

public class W3_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//��ƭȿ�J�iarray��
		System.out.println("�п�J�p��10���ơG");
		int n = sc.nextInt();
		int arr[] = new int[n];
		

		if(n>=10)
		{
			System.out.println("���~�I�п�J�p��10���ơI");
		}
		else
		{	
			////
			
			//�H���Ʀr�iarr
			System.out.print("�}�C�@arr�G ");
			for (int i=0; i<n; i++)
			{
				arr[i]= (int)(Math.random()*100);
				System.out.print(arr[i]+" ");
			}
			
			
			//��arr�ƻs��ans�̡A�A�Ƨ�ans
			System.out.println();
			System.out.print("�}�C�Gans�G ");
			
			int ans[] = Arrays.copyOf(arr, n);
			Arrays.sort(ans);
			for (int i=0; i<n; i++)
			{
				System.out.print(ans[i]+" ");
			}
			
			//��Ƨǫ᪺ans�Marr���
			for (int i=0; i<n;i++)
			{
				for (int j=0; j<n; j++)
				{
					if (ans[j]==arr[i])
					{
						arr[i] = j+1;  //array���O�q0�}�l�A���D�حn�D�q1�}�l
					}
				}
			}
			
			System.out.println();
			System.out.print("���סG ");

			//��Xarr
			for (int i=0; i<n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		

		}
		
			////
			
	}
}
