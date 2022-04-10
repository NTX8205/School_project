//最接近質數問題
//410654114 資工5B李明熹
//2022/3/5
import java.util.Scanner;

public class W2_Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count1 = 0;
		int count2 = 0;
		int number1 = 0;
		int number2 = 0;

		for (int i = num + 1; i >= num; i++) {
			boolean flag = true;

			for (int k = 2; k <= Math.sqrt(i); k++) {

				if (i % k == 0) {
					count1++;
					flag = false;
					break;
				}
			}
			if (flag) {
				number1 = i;
				break;
			}
		}

		for (int j = num - 1; j <= num; j--) {
			boolean flag = true;

			for (int k = 2; k <= Math.sqrt(j); k++) {

				if (j % k == 0) {
					count2++;
					flag = false;
					break;
				}
			}
			if (flag) {
				number2 = j;
				break;
			}
		}

		if (count1 < count2) {
			System.out.print("最接近" + num + "的質數:" + number1);
		} else if (count2 < count1) {
			System.out.print("最接近" + num + "的質數:" + number2);
		} else {
			System.out.print("最接近" + num + "的質數:" + number1 + " " + number2);
		}

	}

}
