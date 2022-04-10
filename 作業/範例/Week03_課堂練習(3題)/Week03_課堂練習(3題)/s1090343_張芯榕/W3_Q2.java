/* Q2:�p��2�ӥ���ƪ��̤j���]��&�̤p�����ƃ�
 * 
 * ���D����:��J��ӥ����x, y�A�Q�Φ]�Ƥ��ѱN�C�ӥ���ƪ��]�Ƥ��O���}�C(array)���A
 * 			x���]�Ʃ��@�Ӱ}�CA�Ay���]�Ʃ��@�Ӱ}�CB�A
 * 			�Q�Ψ�Ӧ]�ư}�CA,B����ƨӭp��X��ӥ���ƪ��̤j���]�ƻP�̤p������
 * Example: ��
 * 			x=18, y = 30��
 * 			18=2*3*3 ���}�CA�x�s[2,3,3]��
 * 			30=2*3*5 ���}�CB�x�s[2,3,5]��
 * 			�z�L�q�Y������X�o��Ӱ}�C, 
 * 			��X18�P30���̤j���]�Ƭ�6�B18�P30���̤p�����Ƭ�90 */

// ��ޤGA / �i��_ / 410903432

import java.util.*;

public class W3_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// �ϥΪ̿�J
		System.out.println("�п�J��ӼƭȤ����@������� x �M y");
		int x = sc.nextInt(), y = sc.nextInt();
		
		// x���]������
		ArrayList<Integer> A = new ArrayList();
		int n = x, p = 2;
		while(n != 1) 
		{
			if(n % p == 0) 
			{
				A.add(p);
				n /= p;
			}else 
				p++;
		}
		
		// y���]������
		ArrayList<Integer> B = new ArrayList();
		n = y;
		p = 2;
		while(n != 1) 
		{
			if(n % p == 0) 
			{
				B.add(p);
				n /= p;
			}else 
				p++;
		}
		
		/*// �տ�X
		System.out.println(A);
		System.out.println(B);
		*/
		
		// ���o�̤j���]��
		int gcd = 1, lcm = 1;
		for(int i = 0; i < A.size(); i++) 
		{
			int j = 0;
			while(j < B.size())
			{
				if(A.get(i) == B.get(j))
				{
					gcd *= A.get(i);
					A.set(i, 0);
					B.set(j, 0);
				}
				j++;
			}
		}
		
		// �����̤p������
		for(int i = 0; i < A.size(); i++)
			if(A.get(i) != 0)
				lcm *= A.get(i);
		
		for(int i = 0; i < B.size(); i++)
			if(B.get(i) != 0)
				lcm *= B.get(i);
		
		// ��X
		System.out.printf("%d�M%d���̤j���]�Ƭ�%d%n", x, y, gcd);
		System.out.printf("%d�M%d���̤j���]�Ƭ�%d%n", x, y, lcm*gcd);
	}
}
