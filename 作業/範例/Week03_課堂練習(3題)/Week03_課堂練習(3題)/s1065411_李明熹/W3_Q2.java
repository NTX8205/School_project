//計算2個正整數的最大公因數&最小公倍數
//410654114 資工5B李明熹
//2022/3/15
import java.util.Scanner;

public class W3_Q2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num1 = sca.nextInt();
		int num2 = sca.nextInt();
		prime(num1, num2);
	}

	public static void prime(int num1, int num2) {
		int[] arr1;
		int[] arr2;
		int[] arr3;

		int count1 = 0;
		int count2 = 0;
		int temp = 0;

		arr1 = new int[count1];
		arr2 = new int[count2];
		arr3 = new int[count1];

		System.out.print(num1 + "=");
		for (int i = 2; i <= num1; i++) {

			while (num1 % i == 0 && num1 != i) {
				num1 /= i;
				count1++;
				System.out.print(i + "*");
				for (int j = 0; j < count1; j++) {
					arr1[j] = i;
				}
			}
			if (num1 == i) {
				count1++;
				arr1[count1] = i;
				System.out.print(i);
				break;
			}
		}
		System.out.println();

		System.out.print(num2 + "=");
		for (int i = 2; i <= num2; i++) {

			while (num2 % i == 0 && num2 != i) {
				num2 /= i;
				System.out.print(i + "*");
				for (int j = 0; j < count2; j++) {
					arr2[j] = i;
				}
			}
			if (num1 == i) {
				count2++;
				arr2[count2] = i;
				System.out.print(i);
				break;
			}
		}
		for (int i = 0; i <= count1; i++) {
			for (int j = 0; j <= count2; j++) {
				if (arr1[i] == arr2[j] && arr1[i] != 0) {
					arr3[i] = arr1[i];

				}

			}
		}

		for (int i = 0; i <= arr1.length; i++) {
			temp = arr3[i];
			if (i + 1 <= arr1.length) {
				temp *= arr3[i + 1];
				i++;
				System.out.print(temp);
			}
		}

	}

}
