/*Q2: �e�q�M�P��q�M*/
//��ޤGB 410903440 ���r��

import java.util.*;

public class W4_Q2 
{

	public static void main(String[] args) 
	{
		System.out.print("�п�J�@�ӥ���ơG");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int pre = 0, count = 0;
		
		for(int i =0; i<n; i++)
		{
			pre+=a[i];
			int post = 0;
			
			for(int j=n-1; j>=0; j--)
			{
				post+=a[j];
				
				if(pre == post)
				{
					count++;
				}
			}
		}
		
		System.out.printf("�e�ݩM�B��ݩM�@�� %d �լۦP", count);

	}

}
