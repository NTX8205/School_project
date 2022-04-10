// Q4(肂絤策): 璸衡ㄢタ俱计程そ计&程そ计(癹伴)
// 410918306 戈恨A 猋
// ら戳 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int mod = 0;
		int n = a;
		int k = b;
		while(k!=0) {
			mod = n%k;
			n = k;
			k = mod;
		}
		System.out.printf("%d 籔 %d 程そ计 %d\n", a, b, n);
		System.out.printf("%d 籔 %d 程そ计 %d", a, b, (a*b)/n);
	}

}
