// Q3: 璸衡ㄢタ俱计程そ计&程そ计
// 410918306 戈恨A 猋
// ら戳 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d 籔 %d 程そ计 %d\n", a, b, gcd(a,b));
		System.out.printf("%d 籔 %d 程そ计 %d", a, b, (a*b)/gcd(a,b));
	}
	
	public static int gcd(int n, int k) {
		if(k==0) {
			return n;
		}else {
			return gcd(k, n%k);
		}
	}
}