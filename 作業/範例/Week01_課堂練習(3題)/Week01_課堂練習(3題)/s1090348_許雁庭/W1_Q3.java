//��ޤGB-410903482-�\���x
//Q3�G�p���ӥ���ƪ��̤j���]��(GCD)&�̤p������(LCM)

import java.util.Scanner;
public class Q3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt() , y = sc.nextInt();
		
		System.out.println(x + "�P" + y + "���̤j���]�Ƭ�" + GCD(x,y));
		System.out.println(x + "�P" + y + "���̤p�����Ƭ�" + LCM(x,y));
	}
	
	static int GCD(int x , int y) {//�̤j���]��
		int z;
		z = x % y;//���l��
		if(z == 0) {
			return y;
		}else {
			return GCD(y,z);
		}
	}
	
	static int LCM(int x , int y) {//�̤p������
		int tmp = 1;

		for(int i = 1 ; i <= x ; i++) {
			if(x % i ==0 && y % i ==0) {
				tmp = i;
			}
		}
		
		return (x*y/tmp);
	}
	
}