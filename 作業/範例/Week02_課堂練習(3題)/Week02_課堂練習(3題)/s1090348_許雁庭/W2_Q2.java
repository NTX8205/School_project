//Q2: �̱����ư��D�A�ϥΪ̿�J�@�ӥ����n, ��X�Pn�̱��񪺽��
//��ޤGB/410903482/�\���x

import java.util.Scanner;
public class W2_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt() , small = 0 , large = 0;
		
		for(int i = n-1 ; i > 1 ; i--)
		{
			if(isPrimeNumber (i)) {
				small = i;
				break;
			}
		}
		
		for(int i = n+1 ; ; i++)
		{
			if(isPrimeNumber (i)) {
				large = i;
				break;
			}
		}
		
		if((large-n) > (n-small))
		{
			System.out.printf("�̱���%d����ơG %d", n , small);
		}
		else if ((large-n) < (n-small))
		{
			System.out.printf("�̱���%d����ơG%d", n , large);
		}
		else
		{
			System.out.printf("�̱���%d����ơG %d %d", n , small , large);
		}
	}

	public static boolean isPrimeNumber (int n)
	{
		int count = 0;
		
		for(int i = 1 ; i <= n ; i++)
		{
	    	if(n%i == 0)
	        	count++;
	    }
		
	    if(count > 2)
	    	return false;
	    else
	        return true;
	}
}