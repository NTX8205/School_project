/*
 * Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
 * ��ޤGB 410903440 ���r��
*/

import java.util.Scanner;

public class W1_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d %n",a, b, GCD(a, b));
		System.out.printf("%d�P%d���̤p�����Ƭ�%d",a, b, LCM(a, b));
	}
	
	static int GCD(int a, int b) {
		int c;
		c = a % b;
		
		if(c == 0)
			return b;
		else
			return GCD(b, c);
	}
	
	static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}
}
