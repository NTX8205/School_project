/*�T���X��
��ޤGB 410917538 ��Ϊ�
2022/03/21
*/
import java.util.*;
public class W4_Q1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����!!");
		int n=sc.nextInt();
		int[] list=new int [n];
		int count=0;
		int m = n;
		
		while(n>1)
		{
			for(int i=0;i<m;i++)
			{
				if(list[i] !=-1)
				{
					count++;
					
					if(count == 3)
					{
						count=0;
						n--;
						list[i]=-1;
					}
				}
			}
		}
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i] !=-1)
			{
				System.out.println(i+1);
			}
		}
	}
}