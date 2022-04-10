//璸衡3タ俱计程そ计&程そ计
//410654114 戈5B縌
//2022/3/11
import java.util.Scanner;

public class W3_Q3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("块x,y,z俱计");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
			int GCD = GCD(num1, num2);
			int GCD1 = GCD(num3, GCD);
			if (GCD1 == 1) {
				System.out.println(num1 + " " + num2 + " " + num3 + "⊿Τ程そ计");
			} else {
				System.out.println(num1 + " " + num2 + " " + num3 + "程そ计" + GCD1);
			}
			int LCM = LCM(num1, num2, GCD);
			int GCD2 = GCD(LCM, num3);
			int LCM1 = LCM(LCM, num3, GCD2);
			System.out.println(num1 + " " + num2 + " " + num3 + "程そ计" + LCM1);
		}
	}

	public static int GCD(int num1, int num2) {
		PX(num1, num2);
		int num = 0;
		for (int i = num2; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				num = i;
				break;
			}
		}
		return num;
	}

	
	public static int LCM(int num1, int num2, int GCD) {
		return num1 / GCD * num2;
	}

	public static void PX(int num1, int num2) {
		int a;
		if (num1 < num2) {
			a = num1;
			num1 = num2;
			num2 = a;
		}
	}

}
