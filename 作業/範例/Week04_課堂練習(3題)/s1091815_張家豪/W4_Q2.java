//�Z��:��ޤGB
//�Ǹ�:410918152
//�m�W:�i�a��
//Q2: �e�q�M�P��q�M
import java.util.Scanner;
public class W4_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		int x[]=new int [n];
		int y[]=new int [n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int f=0;
		for(int i=0;i<a.length;i++)
		{
			f+=a[i];
			x[i]=f;
		}
		int b=0;
		for(int i=n-1;i>=0;i--)
		{
			b+=a[i];
			y[i]=b;
		}
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++) 
			{
				if(x[i]==y[j])
				{
					sum++;
				}
			}
		}
		System.out.println("�@"+sum+"��");
	}
}
