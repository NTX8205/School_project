//�T���X��
//��ޤGB 410917693 �\�e޳
//2022/03/20
import java.util.*;
public class W4_Q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J�@�ӥ���ơG");
		int n = sc.nextInt();
		int [] data = new int [n];
		int remain = n;
		int count = 0;
		int out = -1;
		while(remain >1)
		{
			for(int i = 0; i < n; i++)
			{
				if(data[i] != out)
				{
					count++;
					if(count == 3)
					{
						count = 0;
						remain--;
						data[i] = out;
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			if(data[i] != out)
			{
				System.out.println(i+1);
			}
		}
	}
}
