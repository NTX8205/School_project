package test;
import java.io.*;
import java.util.Scanner;
public class W2_Q1 {
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
		 * [p,q]�϶���ư��D
		      	�ϥΪ̿�J2�ӥ����p,q,��X����p��q�������Ҧ���ƻP����`��*/
		Scanner sc = new Scanner(System.in);
		int i,sum=0,p=sc.nextInt(),q=sc.nextInt();
		
		if(p>q)
		{
			int tmp=p;
			p=q;
			q=tmp;
		}
		
		for(i=p+1;i<q;i++) {
			if(isPrime(i))
			{
				System.out.print(i+" ");
				sum++;
			}		
		}
		
		System.out.print("\n��ƭӼ�:"+sum);
	}
}
