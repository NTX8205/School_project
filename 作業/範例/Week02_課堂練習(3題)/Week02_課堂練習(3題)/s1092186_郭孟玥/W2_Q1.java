//[p,q]區間質數問題
//資管二A 410921862 郭孟玥
//Date:2022/03/04
import java.util.*;
public class W2_Q1 {
	public static boolean isPrimeNumber(int n) {
		if(n%2==0) {
			return n==2;
		}
		else if(n>2) {
			final int nSqrt = (int)Math.floor(Math.sqrt(n));
			for(int i=3 ;i<=nSqrt;i=i+2) {
				if(n%i==0) {
					return false ;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		for(int i=a;i<b;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				sum=sum+1;
			}
		}
		System.out.println("\n質數個數"+sum);
	}
}