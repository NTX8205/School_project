//�Z��:��ޤGB
//�Ǹ�:410918152
//�m�W:�i�a��
//Q1: �T���X��
import java.util.Scanner;
public class W4_Q1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�H��");
		int n=sc.nextInt();
		int [] a=new int [n];
		int m=n;
		int out =-1;
		int count=0;
		while(m>1)
		{
			for(int k=0;k<a.length;k++)
			{
				if(a[k]!=out)
				{
					count++;
					if(count==3)
					{
						count=0;
						a[k]=out;
						m--;
					}
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			if(a[k]!=out)
			{
				System.out.println(k+1);
			}
		}
	}
}
