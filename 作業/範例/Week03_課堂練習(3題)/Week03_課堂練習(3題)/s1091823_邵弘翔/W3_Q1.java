//�D�ػ���:Q1: �ƧǦ���
//�Z��:��ޤGB
//�Ǹ�:410918233
//�m�W:�򥰵�

import java.util.Arrays;
import java.util.Scanner;
public class W3_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����n, �䤤 n<=10");
		int n=sc.nextInt();
		
		if(n<=0 || n>10) 
		{
			System.out.println("�A��J���F");	
		}
		else 
		{
			int a []= new int [n];
			int b []= new int [n];
			for(int i=0;i<n;i++) 
			{
				a[i]=(int)(Math.random()*100)+1;
				System.out.print(a[i]+" ");
				b[i]=a[i];
			}
			System.out.println();
			Arrays.sort(b);
			
			for(int i=0;i<n;i++) 
			{
				for(int k=0;k<n;k++) 
				{
					if(b[i]==a[k]) 
					{
						a[k]=i+1;
						break;
					}
				}
			}
			
			for(int i=0;i<n;i++) 
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}