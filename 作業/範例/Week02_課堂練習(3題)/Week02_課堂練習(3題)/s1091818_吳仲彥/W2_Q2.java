//Q2: �̱����ư��D
//�Z�� ���2A �Ǹ� 410918186 �m�W �d���
//2022/3/6
import java.util.*;
public class W2_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), small=0, large=0;
		for(int i = n-1; i>1; i--) 
		{
			boolean c = false;
			for(int j=2; j<=i; j++)
			{
				if(i==j)
				{
					small = i;
					c = true;
				}
				else if(i%j==0)
				{
					break;
				}
			}
			if (c) 
			{
				break;
			}
		}
		for(int i = n+1; i>n; i++) 
		{
			boolean c = false;
			for(int j=2; j<=i; j++)
			{
				if(i==j)
				{
					large = i;
					c = true;
				}
				else if(i%j==0)
				{
					break;
				}
			}
			if (c) 
			{
				break;
			}
		}
		if((large-n) > (n-small)) 
		{
			System.out.printf("�̱���%d�����:%d",n , small);
		}
		else if((large-n) < (n-small)) 
		{
			System.out.printf("�̱���%d�����:%d",n , large);
		}
		else 
		{
			System.out.printf("�̱���%d�����:%d %d",n , small, large);
		}
	}
}
