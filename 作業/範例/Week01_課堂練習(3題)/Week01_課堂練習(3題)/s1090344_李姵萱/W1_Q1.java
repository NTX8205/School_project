/*
 * Q1: �P�_�ϥΪ̿�J������ƬO�_�����
 * ��ޤGB 410903440 ���r��
*/

import java.util.Scanner;

public class W1_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean judge = false;
		while (sc.hasNext()) {
			judge = false;
			n = sc.nextInt();
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					judge = true;
					System.out.printf("%d���O���", n);
					break;
				}
			}
			if (judge == false) {
				System.out.printf("%d�O���", n);
			}
		}

	}
}