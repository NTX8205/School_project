/*
 	���:2022/03/09
 	�D��:�ƧǦ���
 		(�ϥΪ̿�J�@�ӥ����n, �䤤n<=10. �Q�ζü��H������n�Ӥ���1~100������ƨ��x�s��@���}�C��)
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */

import java.util.*;
public class W3_Q1 
{
	public static void main(String args[]) 
	{	System.out.println("�п�J�@�ӥ����");
		Scanner sc=new Scanner(System.in);
		Random rand = new Random();

		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.printf("�H�����ͪ�%d�ӥ���Ƥ��O��:",n);
		for(int i=0;i<n;i++) 
		{
			arr[i]= rand.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int a[]=new int[n];
		int s=0;
		
		for(int i=1;i<=n;i++) 
		{
			int min=101;
			for(int j=0;j<n;j++) 
			{
				if(a[j]==0 && min>=arr[j]) 
				{
					min=arr[j];
						s=j;
				}
			}
			a[s]=i;
		}
		System.out.printf("�o%d�Ӿ�Ʀb�Ƨǫ᪺���ަ��Ǭ�:",n);
		for(int j=0;j<n;j++) 
		{
			System.out.print(a[j]+" ");
		}
	}
}
