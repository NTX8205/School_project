//�Z��:��ޤGB
//�Ǹ�:410918233
//�m�W:�򥰵�
//Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
import java.util.Scanner;
public class W1_Q3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d%n",a,b,GCD(a,b));
		System.out.printf("%d�P%d���̤j�����Ƭ�%d%n",a,b,a*b/GCD(a,b));
	}
	
	static int  GCD(int x,int y)
	{
		int tem;
		tem=x%y;
		if(tem==0) 
		{
			return y;
		}else {
			return GCD(y,tem);
		}
	}

}
