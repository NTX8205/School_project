//Q5: �p��T�ӥ���ƪ��̤j���]��&�̤p������
//�Z��:��ޤGB
//�Ǹ�:410918233
//�m�W:�򥰵�
import java.util.Scanner;
public class W1_Q5N
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//�ϥΪ̿�J�T�ӥ����
        System.out.println("�п�J�T�ӥ����");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int i = 2;
		int gcd = 1;
		int lcm = 1;
		int a = x;
		int b = y;
		int c = z;
		while(x!=1 || y!=1 || z!=1) {
			if(x%i==0 && y%i==0 && z%i==0) 
			{
				gcd*=i;
				lcm*=i;
				x/=i;
				y/=i;
				z/=i;
			}
			else if(x%i==0 && y%i==0) 
			{
				lcm*=i;
				x/=i;
				y/=i;
			}
			else if(y%i==0 && z%i==0) 
			{
				lcm*=i;
				y/=i;
				z/=i;
			}
			else if(x%i==0 && z%i==0) 
			{
				lcm*=i;
				x/=i;
				z/=i;
			}else if(x%i==0) {
				lcm*=i;
				x/=i;
			}
			else if(y%i==0) 
			{
				lcm*=i;
				y/=i;
			}
			else if(z%i==0)
			{
				lcm*=i;
				z/=i;
			}
			else 
			{
				i++;
			}
		}
		System.out.println(a+"�P"+b+"�P"+c+"���̤j���]�Ƭ�"+gcd);
		System.out.println(a+"�P"+b+"�P"+c+"���̤p�����Ƭ�"+lcm);
	}
}
