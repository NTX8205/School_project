/*
 * Q2: 將使用者輸入的正整進行質因數分解
 * 資管二B 410903440 李姵萱
*/

import java.util.Scanner;

public class W1_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        System.out.print(num + "=");
        
        for (int i = 2; i <= num; i++) {
            while (num != i) {
                if (num % i == 0) {
                    System.out.print(i + "*");
                    num /= i;
                } else {
                    break;
                }
            }

        }
        System.out.print(num);
	}

}