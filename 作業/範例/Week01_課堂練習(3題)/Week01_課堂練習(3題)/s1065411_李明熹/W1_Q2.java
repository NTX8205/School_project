//將使用者輸入的正整進行質因數分解
//410654114 資工5B李明熹
//2022/2/23
import java.util.Scanner;

public class W1_Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print(num + "=");
		for (int k = 2; k <= num; k++) {
			while (num != k) {
				if (num % k == 0) {
					System.out.print(k + "*");
					num /= k;
				} else {
					break;
				}
			}

		}
		System.out.print(num);
	}
}