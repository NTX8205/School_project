//�e�q�M�P��q�M
//��ޤGA 410917774 ���Y��
//2022.03.19
import java.util.*;
public class W4_Q2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
			
		int pre=0;//�e�q�M��l��
		int count=0;//�ΨӼƦ��h�֭ӫe�q�M,��q�M
			
		for(int i=0; i<n; i++)
		{
			pre+=a[i];//�q��0�ӯ��ޭȥ[�i��
			
			int post=0;//��q�M��l�ȡA�C�@���[�i�ӳ��n�k�s
			for(int j=n-1;j>=0;j--)//�q�᭱�[�^��
			{
				post+=a[j];
				if(pre==post)
					count++;
				}
		}
		System.out.println(count);
		}
	}

