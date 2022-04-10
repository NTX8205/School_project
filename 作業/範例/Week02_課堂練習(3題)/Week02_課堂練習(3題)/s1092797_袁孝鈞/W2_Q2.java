import java.util.Scanner;
public class W2_Q2 {
	public static boolean isPrimeNumber(int n) {
		if( n%2 == 0) {
		return n == 2;
		} else if (n>2) {
		final int nSqrt = (int)Math.floor(Math.sqrt(n));
		for(int i=3; i<=nSqrt; i+=2) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	} else {
		return false;
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt(),small=0,large=0;
		for(int i=a-1;i>1;i--) {
			if(isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		for(int i=a+1;;i++) {
			if(isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-a)>(a-small)) {
			System.out.printf("�̱���%d�����:%d",a,small);
		}
		else if((large-a)<(a-small)) {
			System.out.printf("�̱���%d�����:%d",a,large);
		}
		else {
			System.out.printf("�̱���%d�����:%d",a,small,large);
		}
	}
}
//�̱����ư��D
//��ޤGB 410927973 �K���v