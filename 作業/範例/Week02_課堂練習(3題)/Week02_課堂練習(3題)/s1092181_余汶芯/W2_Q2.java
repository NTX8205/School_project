import java.util.Scanner;
//��ޤGB 410921812 �E�Z��
//Q2: �̱����ư��D
public class web {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		isPrime iP = new isPrime();
		int n = sc.nextInt(), small = 0, large = 0;
		for (int i = n - 1; i > 1; i--) {
			if (iP.isPrimeNumber(i)) {
				small = i;
				break;
			}
		}

		for (int i = n + 1;; i++) {
			if (iP.isPrimeNumber(i)) {
				large = i;
				break;
			}
		}
		if((large-n)>(n-small)) {
			System.out.printf("�̱���%d���:%d",n,small);
		}else if((large-n)<(n-small)) {
			System.out.printf("�̱���%d���:%d",n,large);
		}else {
			System.out.printf("�̱���%d���:%d",small,large);
		}
	}

	/*public class isPrime {
		public static boolean isPrimeNumber(int n) {
			if (n % 2 == 0) {
				return n == 2;
			} else if (n > 2) {
				final int nSqrt = (int) Math.floor(Math.sqrt(n));
				for (int i = 3; i <= nSqrt; i += 2) {
					if (n % i == 0) {
						return false;
					}
				}
				return true;
			} else {
				return false;
			}
		}
	}*/
}
