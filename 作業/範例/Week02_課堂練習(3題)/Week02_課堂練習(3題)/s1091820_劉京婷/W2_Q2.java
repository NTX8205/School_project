/*
  	���:2022/03/02
 	�D��:2.�̱����ư��D
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */

import java.util.*;
public class W2_Q2 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�@�Ӿ��");
		int n=sc.nextInt();
		int count=0,min=1,max=n+1;
		
		System.out.printf("�̱���%d�����:",n);
		int i=0;
		
		while(i<n) 
		{
			for(int j=1;j<n;j++) 
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				min=i;
			}
			i++;
			count=0;
		}
	
		while(max>n) 
		{
			count=0;
			for(int j=1;j<=max;j++) 
			{
				if(max%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				break;
			}
			max++;
		}

		if(n-min>max-n) 
		{
			System.out.print(max);
		}
		else if(n-min<max-n)
		{
			System.out.print(min);
		}
		else 
		{
			System.out.printf("%d�M%d",min,max);
		}
	}
}
