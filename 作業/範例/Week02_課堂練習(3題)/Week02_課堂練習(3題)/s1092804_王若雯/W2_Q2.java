//Q2: �̱���n�����
//
//�t��:��ޤGA
//�Ǹ�:410928042
//�m�W:���Y��
import java.util.*;
public class W2_Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(), small=0, large=0;
		for(int i=n-1;i>1;i--) {
			if(IsPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		
		for(int i=n+1;;i++) {
			if(IsPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-n)>(small-n)) {
			System.out.printf("�̱���%d����Ƭ�:%d",n,large);
		}else if((small-n)>(large-n)) {
			System.out.printf("�̱���%d����Ƭ�:%d",n,small);
		}else {
			System.out.printf("�̱���%d����Ƭ�:%d�B%d",n,large,small);
		}
	}
		public static boolean IsPrimeNumber(int n) {
			if(n%2==0) {
				return n == 2;
			}else if(n>2) {
				for(int i=3;i<n;i+=2) {
					if(n%i==0) {
						return false;
				}
			}		
				return true;
			}else {
				return false;
			}
		}
}
