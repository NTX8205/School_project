//Q3:�p���ӥ���ƪ��̤j���]��&�̤p������
//�Z��:���2A �Ǹ�:410918186 �m�W:�d���
//���:2022/2/23
import java.util.*;
public class W1_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("�̤j���]��:" + GCD(a, b));
		System.out.print("�̤p������:" + LCM(a, b));
	}
	public static int GCD(int a, int b) 
	{
		int temp;
		while(a % b !=0) 
		{
			temp = a % b;
			a = b;
			b = temp;
		}
		return b;
	}
	public static int LCM(int a, int b) 
	{
		return a*b/GCD(a, b);
	}
}

