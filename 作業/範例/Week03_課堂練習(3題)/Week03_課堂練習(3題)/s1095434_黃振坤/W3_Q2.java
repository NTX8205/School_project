//Q2:�p��2�ӥ���ƪ��̤j���]��&�̤p������
//��ޤGA 410954344	�����[
//date:0315
import java.util.*;
public class W3_Q2 
{

	public static void main(String[] args) 
	{
		// TODO �۰ʲ��ͪ���k Stub
		//��ޤGA 410954344	�����[
				Scanner sc=new Scanner(System.in);
				System.out.println("�п�J�Ĥ@�Ӿ��:");
				int x= sc.nextInt();
				System.out.println("�п�J�ĤG�Ӿ��:");
				int y =sc.nextInt();
				
				int[] a=resolve(x);
				int[] b=resolve(y);
				
				int gcd=1,lcm=1;
				
				for(int i=1 , j = 1; i<=a[0];i++)
				{
					for(int k = j;k<=b[0];k++)
					{
						if(a[i]==b[k])
						{
							j=k+1;
							gcd*=a[i];
							b[k]=1;
							break;
						}
					}
				}
				for(int i=1;i<=a[0];i++)
					lcm*=a[i];
				for(int i =1; i<=b[0];i++)
					lcm*=b[i];
				
				System.out.println("�̤p������:"+gcd);
				System.out.println("�̤j���]��:"+lcm);
	}


		public static int[] resolve(int n)
{
	int[] arr=new int[50];
	int cnt=0;
	
	for(int i=2;n!=1;i++)
	{
		while(n % i==0)
		{
			arr[++cnt]=i;
			n/=i;
		}
	}
	arr[0]=cnt;
	return arr;
}
}


