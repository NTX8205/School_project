//最接近質數問題
//資管二A 410918241 陳芷柔
//日期:2022/03/08
import java.util.*;
public class W2_Q2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		W2_Q1 ip = new W2_Q1();
		int small=0;
		int n = sc.nextInt();
		int large=0;
		
		for(int i=n-1;i>1;i--) {
			if(ip.isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		
		for(int i=n+1;;i++) {
			if(ip.isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		
		if((large-n)>(n-small)) {
			System.out.printf("最接近%d的質數:%d",n,small);
		}
		else if((large-n)<(n-small)) {
			System.out.printf("最接近%d的質數:%d",n,large);
		}
		else {
			System.out.printf("最接近%d的質數:%d %d",n,small,large);
		}
	}
}