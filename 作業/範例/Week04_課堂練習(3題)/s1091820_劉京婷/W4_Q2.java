/*
 	���:2022/03/16
 	�D��:2.�e�q�M�P��q�M
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */
import java.util.*;
public class W4_Q2 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�п�J�@�Ӱ}�C���j�p");
		
		int n=sc.nextInt();
		System.out.printf("�п�J%d�Ӿ��%n",n);
		
		int arr[]=new int [n];
		int a[]=new int [n];
		int b[]=new int[n];
		int sum=0,count=0,cnt=0;
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
			a[i]=sum;
		}

		for(int j=n-1;j>=0;j--) 
		{	
			count+=arr[j];
			b[j]=count;
		}
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(a[i]==b[j]) 
				{
					cnt++;
				}
			}
		}
		
		System.out.printf("�@��%d�թM�ۦP",cnt);
	}
}
