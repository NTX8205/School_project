//Q2: �̱����ư��D
//��ޤGB ��굾 410917504
import java.util.Scanner;
public class W2_Q2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		isprime iP = new isPrime();
		int n = sc.nextInt(), small=0, large=0;
		for(int i=n-1;i>1;i--) {
			if(iP.isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		for(int i=n+1; ;i++) {
			if(iP.isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-n) > (n-small)) {
			System.out.printf("�̱���%d�����%d", n, small);
		}
		else if((large-n)<(n-small)) {
			System.out.printf("�̱���%d�����%d", n, large);
		}
		else {
			System.out.printf("�̱���%d�����%d %d", n, small, large);
		}
	}
}
