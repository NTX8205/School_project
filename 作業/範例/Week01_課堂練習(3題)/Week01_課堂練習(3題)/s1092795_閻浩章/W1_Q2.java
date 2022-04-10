//
//Q2: 將使用者輸入的正整進行質因數分解
//
//資管二B 410927957 閻浩章
//Date:2022/02/23
import java.util.ArrayList;
import java.util.Scanner;
public class W1_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		System.out.print(n + "=");
		for (int i = 2; i <= n; i++) {
            while (n != i) {
                if (n % i == 0) {
                    System.out.print(i + "*");
                    n /= i;
                } else {
                    break;
                }
            }
        }
		System.out.print(n);
	}

}
