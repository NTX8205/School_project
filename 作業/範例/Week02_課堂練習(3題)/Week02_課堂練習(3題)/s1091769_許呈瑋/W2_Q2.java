//�϶���ư��D
//��ޤGB 410917693 �\�e޳
//2022/03/04
import java.util.*;
public class W2_Q2 {
	public static boolean isPrimeNumber(int n) {
		if(n%2==0) {
			return n==2;
		}else if(n>2){
			for(int i = 3;i < n;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = 0, l = 0;
		
		for(int i = n-1; i > 1 ; i--) {
			if(isPrimeNumber(i)) {
				s = i;
				break;
			}
		}
		
		for(int i = n+1;; i++) {
			if(isPrimeNumber(i)) {
				l = i;
				break;
			}
		}
		
		if((l-n) > (n-s)) {
			System.out.printf("�̱���%d�����%d",n,s);
		}else if((l-n) < (n-s)) {
			System.out.printf("�̱���%d�����%d",n,l);
		}else {
			System.out.printf("�̱���%d�����%d %d",n,s,l);
		}
	}
}
