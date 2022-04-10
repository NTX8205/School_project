/*資管二B 410917538 何佳芯
 * Q2 最接近質數問題
 2022/03/04
 */
import java.util.*;
public class W2_Q2{
	
	public static boolean isPrimeNumber(int n) {
		if(n%2==0) {
			return n==2;
		}else if(n>2) {
			final int nSqrt=(int)Math.floor(Math.sqrt(n));
			for(int i=3;i<=nSqrt;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int small=0;
		int large=0;
		for(int i=n-1;i>1;i--) {
			if(isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		
		for(int i=n+1;;i++) {
			if(isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		
		if((large-n)>(n-small)) {
			System.out.printf("最接近%d的質數:%d",n,small);
		}else if((large-n)<(n-small)) {
			System.out.printf("最接近%d的質數:%d",n,large);
		}else {
			System.out.printf("最接近%d的質數:%d %d",n,small,large);
		}

	}

}
