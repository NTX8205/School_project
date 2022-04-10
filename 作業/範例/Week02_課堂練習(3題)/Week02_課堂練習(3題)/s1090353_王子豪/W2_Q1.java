//Q1: [p,q]�϶���ư��D
//��ޤGA 410903539 ���l��
import java.util.*;
public class W2_Q1 {
	public static boolean isPrimeNumber(int n){
		if(n%2 == 0) {
			return n == 2;
		}else if (n>2) {
			final int nSqrt = (int)Math.floor(Math.sqrt(n));
			for(int i=3;i<=nSqrt;i+=2) {
				if(n%i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum=0,x=sc.nextInt(),y=sc.nextInt();
		if(x>y) {
			int tmp = x;
			x=y;
			y=tmp;
		}
		for(int i=x;i<y;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				sum+=1;
			}
		}
		System.out.println("\n��ƭӼ�:"+sum);
	}
}