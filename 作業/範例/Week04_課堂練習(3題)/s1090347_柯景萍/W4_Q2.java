//�D�ػ���:�e�q�M�P��q�M
//��ޤGA 410903474 �_����
//Date:2022/03/22
package test;
import java.util.*;
public class W4_Q2 
{
	public static void main(String[] args) 
	{
		System.out.println("��J�@�Ӿ��n�A�A��Jn�Ӿ�Ƶ� x[0]�Bx[1]...��x[n-1]");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]aa = new int [n];		
		
		for(int i=0;i<n;i++)
		{
       		aa[i]=sc.nextInt();
		}
		
		int sum=0;
		int all=0;
		
		for(int i=0;i<n;i++) 
		{			
			sum+=aa[i];		
			int count=0;			
			for(int j=n-1;j>=0;j--) 
			{				
				count+=aa[j];				
				if(sum==count) 
				{	
					all++;
				}
			}			
		}
		System.out.print(all);
	}
}