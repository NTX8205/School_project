/*
 * �Z�šG��ޤGB
 * �Ǹ��G410917928
 * �m�W�G�L�f�g
 * �D�ءGW4_Q1 �T���X��
 * ����G2022/03/16
 */
import java.util.*;

public class W4_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�Jn�G");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=n;i++)
		{
			sum = (sum+3)%i;
		}
				
		System.out.println("�̫�@�ӥ��X���̪��s����" + (sum+1));
		
	}

}
