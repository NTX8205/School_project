/*
 * �Z�šG��ޤGB
 * �Ǹ��G410917928
 * �m�W�G�L�f�g
 * �D�ءGW4_Q2 �e�q�M�P��q�M
 * ����G2022/03/16
 */
import java.util.*;

public class W4_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�Jn�G");
		int n = sc.nextInt();
		System.out.print("�п�J"+ n + "�Ӿ�ơG");
		
		////
		int arr[] = new int[n];
		for (int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			//System.out.print(arr[i]);
		}
		System.out.print("��J�ơG");
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}

		
		System.out.println();
		
		//�e�qarrf
		int arrf[] = new int[n];
		int sumf = 0;
		System.out.print("�e�q�M�G");
		for (int i=0; i<n; i++)
		{
			arrf[i] = sumf+arr[i];
			sumf += arr[i];
			System.out.print(arrf[i]+" ");
		}
		
		System.out.println();
		
		//��qarrb
		int arrb[] = new int[n];
		int sumb = 0;
		System.out.print("��q�M�G");
		for (int i=n-1; i>=0; i--)
		{
			arrb[i] = sumb+arr[i];
			sumb += arr[i];
			System.out.print(arrb[i]+" ");
		}
		
		/* ��ڤW��arrb���o��
		for (int i=0; i<n; i++)
		{
			System.out.print(arrb[i]+" ");
		}
		*/
		
		//���
		int count = 0;  //�`�@�h�֭Ӥ@��
		for (int i=0; i<n; i++)
		{
			for (int j=n-1; j>=0; j--)  //�]��arrb�O�˹L�ө�
			{
				if (arrf[i]==arrb[j])
				{
					count++;
				}
			}
		}
		System.out.println();
		System.out.print(count);

		////
		
	}

}
