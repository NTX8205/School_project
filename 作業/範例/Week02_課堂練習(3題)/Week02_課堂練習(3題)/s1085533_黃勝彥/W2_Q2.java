package test;
import java.io.*;
import java.util.Scanner;
public class W2_Q2 {
	public static boolean isPrime(int a)
	{
		int i,count=0;
		
		for(i=1;i<=a;i++) 
		{
			if(a%i==0)
				count++;
		}
		
		if(count>2)
			return false;
		else 
			return true;		
	}

	public static void main(String[] args) {
		/*��ǤTB 410855338  ���ӫ�
		 * �̱����ư��D
			�ϥΪ̿�J�@�ӥ����n,��X�Pn�̱��񪺽��*/
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),small=0,large=0;
		
		for(int i=n-1;;i--) 
		{
			if(isPrime(i))
			{
				small=i;
				break;
			}
		}
		
		for(int i=n+1;;i++) 
		{
			if(isPrime(i))
			{
				large=i;
				break;
			}
		}
		
		if((large-n)>(n-small))
			System.out.printf("�̱���%d�����: %d",n,small);
		
		else if((n-small)>(large-n))
			System.out.printf("�̱���%d�����: %d",n,large);
		
		else
			System.out.printf("�̱���%d�����:%d %d",n,small,large);

	}

}
