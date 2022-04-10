//[p,q]區間質數問題
//資管二B 410918217 洪珮瑜
//Date: 2022/03/04

import java.util.*;
public class W2_Q1 {
	public static boolean isPrimeNumber(int n) {
		if(n%2 == 0) {
			return n ==2;
		}else if(n>2) {
			for(int i=3; i<n ;i++) {
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
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a = sc.nextInt(), b=sc.nextInt();
		
		if(a>b) {
			int tmp = a;
			a=b;
			b = tmp;
		}
		
		for(int i=a; i<b ;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				sum+=1;
			}
		}
		
		System.out.println("\n質數個數:"+sum);
		

	}

}
