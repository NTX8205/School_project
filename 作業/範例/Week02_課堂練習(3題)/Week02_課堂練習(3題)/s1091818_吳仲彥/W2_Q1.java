//Q1: [p,q]�϶���ư��D
//�Z�� ���2A �Ǹ� 410918186 �m�W �d���
//2022/3/6
import java.util.*;
public class W2_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), cnt = 0;
		for(int i = Math.min(x, y); i<=Math.max(y, x); i++) 
		{
			for(int j=2; j<=i; j++)
			{
				if(i==j)
				{
					System.out.print(i + " ");
					cnt++;
				}
				else if(i%j==0)
				{
					break;
				}
			}
		}
		System.out.printf("%n��ƭӼ�:%d",cnt);
	}
}
