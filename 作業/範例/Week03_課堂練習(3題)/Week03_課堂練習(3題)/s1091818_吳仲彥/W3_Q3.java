//Q3:�p��3�ӥ���ƪ��̤j���]��&�̤p������
//�Z�� ���2A �Ǹ� 410918186 �m�W �d���
//2022/3/15
import java.util.*;
public class W3_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt(), y=sc.nextInt(), z=sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		int f=2; int GCD=1; int LCM=1;
		int X=x; int Y=y; int Z=z;
		while(X>=f && Y>=f && Z>=f) 
		{
			if(X%f==0 && Y%f==0 && Z%f==0) 
			{
				GCD*=f;
				LCM*=f;
				X/=f;
				Y/=f;
				Z/=f;		
			}
			else if(X%f==0 && Y%f==0)
			{
				LCM*=f;
				X/=f;
				Y/=f;
			}
			else if(X%f==0 && Z%f==0)
			{
				LCM*=f;
				X/=f;
				Z/=f;
			}
			else if(Z%f==0 && Y%f==0)
			{
				LCM*=f;
				Z/=f;
				Y/=f;
			}
			else
			{
				f++;
			}
		}
		LCM=LCM*X*Y*Z;
		System.out.printf("%d�P%d�P%d���̤j���]�Ƭ�%d%n",x , y, z, GCD);
		System.out.printf("%d�P%d�P%d���̤p�����Ƭ�%d",x , y, z, LCM);
	}
}