//�̱����ư��D
//��ޤGB 410928034 ������
//2022/3/4
import java.util.*;
public class W2_Q2 {
	public static boolean isPrimeNumber(int n){
		if(n%2==0) {
			return n == 2;
		}
		else if (n>2) {
			for(int i=3;i<n;i+=2) {
				if(n%i ==0 ) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),small = 0, large =0;
		for(int i=n+1;;i++) {
			if(isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		for(int i=n-1;i>1;i--) {
			if(isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		if((large-n)>(n-small)) {
			System.out.printf("�̱���%d�����:%d",n,small);
		}
		else if((large-n)<(n-small)) {
			System.out.printf("�̱���%d�����:%d",n,large);
		}
		else if((large-n)==(n-small)) {
			System.out.printf("�̱���%d�����%d %d",n,small,large);
			
		}
	}
}
