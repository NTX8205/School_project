import java.util.*;
public class W3_Q1 
{
	public static void main(String[] args) 
	{
		//��ޤGA 410917855 ���f��
		//�ƧǦ���
		Scanner io=new Scanner(System.in);
		System.out.println("�п�J�Q�n�X�Ӷüư���j�p(1<=n<=10):");
		int n=io.nextInt();
		int a[]=new int[n];
		int aa[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("���A�ͦ����üƦp�U");
		for(int i:a) 
		{
			System.out.print(i+" ");
		}	
		System.out.println();
		for(int i=0;i<n;i++) 
		{
			int sum=1;
			for(int j=0;j<n;j++) 
			{
				if(a[i]>a[j]) 
				{
					sum++;
				}
			}
			aa[i]=sum;
		}
		System.out.println("���A�񧹤j�p�F");
		arr(aa,n);
	}
	static void arr(int a[],int n) 
	{
		for(int i=0;i<n;i++)
			{
			if(i==n-1)
				{
				System.out.print(a[i]);
				break;
				}
			System.out.print(a[i]+" ");
			}
	}
}
