/*
  	���:2022/03/02
 	�D��:3.��]�Ƥ��Ѷi����
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */

import java.util.*;
public class W2_Q3 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�@�Ӿ��");
		int n=sc.nextInt();
		int sum=0;
		
		System.out.print(n+"=");
		for(int i=2;;) 
		{
			if(n%i==0) 
			{
				sum++;
				n=n/i;
			}
			else 
			{
				if(sum>1) 
				{
					System.out.print(i+"^"+sum);
				}
				else if(sum==1) 
				{
					System.out.print(i);
				}
				else if(sum==0)
				{
					i++;
					continue;
				}
				sum=0;
				i++;
				if(n!=1) 
				{
					System.out.print("*");
				}else 
				{
					break;
				}
			}
		}
	}
}
