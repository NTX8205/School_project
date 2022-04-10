//區間質數問題
//資管二A 410918241 陳芷柔
//日期:2022/03/06
import java.util.Scanner;
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
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>y) {
			int tmp=x;
			x=y;
			y=tmp;
		}
		for(int i=x;i<y;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				sum=sum+1;
			}
		}
		System.out.println("\n質數個數"+sum);
	}
}