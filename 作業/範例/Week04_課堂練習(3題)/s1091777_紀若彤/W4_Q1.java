//�T���X��
//��ޤGA 410917774 ���Y��
//2022.03.19
import java.util.*;

public class W4_Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int people[]=new int[n];
		int remain=n;//�٦s����
		int count=0;//����
		while(remain>1)
		{
			for(int i=0; i<n; i++)
			{
				if(people[i] != -1)//-1��ܬ��X��
					{
					count++;
					if(count == 3)
					{
						count=0;
					    remain--;
						people[i]=-1;
						}
					}
				}
			}
			for(int i=0; i<n; i++)
			{
				if(people[i] != -1)
				{
					System.out.println("�d�U�Ӫ��O:"+(i+1));
				}
			}
			
		}

	}



