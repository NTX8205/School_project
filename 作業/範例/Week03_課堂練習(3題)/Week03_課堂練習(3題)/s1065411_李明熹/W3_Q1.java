
// 排序次序
//410654114 資工5B李明熹
//2022/3/10
import java.util.Random;
import java.util.Scanner;

public class W3_Q1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sca = new Scanner(System.in);
		int input = sca.nextInt();
		int[] inputarr;
		inputarr = new int[input];
		int[] inputarr2;
		inputarr2 = new int[input];

		System.out.print("假設隨機產生的四個正整數分別為" + " ");
		for (int i = 0; i < input; i++) {

			int sum = rand.nextInt(100);
			inputarr[i] = sum;
			System.out.print(inputarr[i] + " ");
		}

		for (int i = 0; i < inputarr.length; i++) {
			inputarr2[i] = inputarr[i];
		}

		System.out.println();
		for (int i = 0; i < inputarr2.length; i++) {
			for (int j = 0; j < inputarr2.length - 1 - i; j++) {
				int tmp = 0;
				if (inputarr2[j] > inputarr2[j + 1]) {
					tmp = inputarr2[j];
					inputarr2[j] = inputarr2[j + 1];
					inputarr2[j + 1] = tmp;
				}
			}

		}

		System.out.print("這四個整數在排序後的索引次序為 ");
		for (int i = 0; i < inputarr.length; i++) {
			for (int j = 0; j < inputarr2.length; j++) {
				if (inputarr[i] == inputarr2[j]) {
					System.out.print(j + " ");
				}
			}
		}

	}

}
