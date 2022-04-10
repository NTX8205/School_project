import java.util.Scanner;
//資管二B 410921812 余汶芯
//Q3: 質因數分解進階版
public class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		System.out.print(n + " = ");
		for (int i = 2;;) {
			if (n % i == 0) {
				count++;
				n /= i;
			} else {
				if (count > 1) {
					System.out.print(i + "^" + count);
				} else if (count == 1) {
					System.out.print(i);
				} else if (count == 0) {
					i++;
					continue;
				}
				count = 0;
				i++;
				if (n == 1) {
					break;
				} else {
					System.out.print("*");
				}
			}
		}

	}
}
