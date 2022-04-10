/*
 * Q1: 判斷使用者輸入的正整數是否為質數
 * 資管二B 410903440 李姵萱
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
					System.out.printf("%d不是質數", n);
					break;
				}
			}
			if (judge == false) {
				System.out.printf("%d是質數", n);
			}
		}

	}
}