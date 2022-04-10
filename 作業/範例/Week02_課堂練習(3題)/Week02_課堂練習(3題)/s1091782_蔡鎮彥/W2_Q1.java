/*Q1: [p,q]區間質數問題
使用者輸入兩個正整數p, q, 找出介於p到q之間的所有質數與質數總數 
資管二B 410917821 蔡鎮彥
*/
import java.io.*;
import java.util.*;
public class Q1 {

	public static boolean isPrimeNumber(int n){
		if(n%2 == 0) {
			return n == 2;
		}else if (n>2) {
			final int nSqrt = (int)Math.floor(Math.sqrt(n));
			for(int i=3; i<=nSqrt; i+=2) {
				if(n%i == 0) {
					return false;
				}
			}
			
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, a=sc.nextInt(), b=sc.nextInt();
		if(a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		for(int i=a; i<b; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				sum+=1;
			}
		}
		System.out.println("\n質數個數"+sum);
	}

}
