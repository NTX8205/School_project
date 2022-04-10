/*
  	ら戳:2022/02/23
 	肈ヘ:3.璸衡ㄢタ俱计程そ计&程そ计
	痁:戈恨A
	厩腹:410918209
	﹎:糂ㄊ碄
 */

import java.util.*;
public class W1_Q3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.printf("%d籔%d程そ计%d%n",n,m,gcd(n,m));
		System.out.printf("%d籔%d程そ计%d",n,m,lcm(n,m));
	}
	static int gcd(int n,int m) {
		if(n%m==0) {
			return m;
		}
		else {
			return gcd(m,n%m);
		}
	}
	static int lcm(int n,int m) {
		return n*m/gcd(n,m);
	}
}
