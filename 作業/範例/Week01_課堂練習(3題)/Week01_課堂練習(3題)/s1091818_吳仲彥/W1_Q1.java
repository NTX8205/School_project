//Q1: �P�_�ϥΪ̿�J������ƬO�_�����
//�Z��:���2A �Ǹ�:410918186 �m�W:�d���
//���:2022/2/23
import java.util.*;
public class W1_Q1
{
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt<=2)
		{
			System.out.println(n + "�O���");
		}
		else
		{
			System.out.println(n + "���O���");
		}
	}
}