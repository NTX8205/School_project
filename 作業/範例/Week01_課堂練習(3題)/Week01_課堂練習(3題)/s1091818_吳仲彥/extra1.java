//Exra1:GCD&LCM(�G�ӥ����)�j�骺�Ѫk
//�Z��:���2A �Ǹ�:410918186 �m�W:�d���
//���:2022/2/23
import java.util.Scanner;
public class extra1 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Max_Min(x,y);
	}
		public static void Max_Min(int x,int y)
		{
		int i = x;
		int j = y;
		int a =0,b =0;
		if(x < y)
		{
			a = y;
			y = x;
			x = a;
		}
		while(y != 0)
		{
			b = x % y;
			x = y;
			y = b;
		}
		int t = i * j / x;
		System.out.println(i+"�M"+j+"���̤j���]�Ƭ�"+ x);
		System.out.println(i+"�M"+j+"���̤p�����Ƭ�"+ t);
		}

}