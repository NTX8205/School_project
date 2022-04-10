import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		int a = 30;
		int b = 18;
		System.out.println(GCD(a, b));
		System.out.println(LCM(a, b));
	}

	static int GCD(int a, int b) {
		int c;
		c = a % b;
		if (c == 0) {
			return b;
		} else {
			return GCD(b, c);
		}
	}

	static int LCM(int a, int b) {
		  int max = 1;
	        for (int i = 2; i <= a; i++) {
	            if (a % i == 0 && b % i == 0) {
	                max = i;
	            }
	        }
			return a * b / max;
	}
}
