//將使用者輸入的正整進行質因數分解
//410654114 資工5B李明熹
//2022/3/15
import java.util.Scanner;

public class W1_Q2N {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入一數進行質因數分解:");
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
