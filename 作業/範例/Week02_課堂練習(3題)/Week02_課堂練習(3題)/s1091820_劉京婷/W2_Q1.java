/*
  	���:2022/03/02
 	�D��:1.[p,q]�϶���ư��D
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */

import java.util.*;
public class W2_Q1 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J��ӥ����");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int tmp,count=0,sum=0;
		
		if(p>q) 
		{
			tmp=p;
			p=q;
			q=tmp;
		}
		
		for(int i=p;i<=q;i++) 
		{
			count=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) 
				{
					count++;	
				}
			}
			if(count==2) 
			{
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("��ƭӼ�:"+sum);
	}
}
