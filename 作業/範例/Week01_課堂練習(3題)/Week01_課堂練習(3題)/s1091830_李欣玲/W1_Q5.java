// Q5(肂絤策): 璸衡タ俱计程そ计&程そ计
// 410918306 戈恨A 猋
// ら戳 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<3;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int gcd = 0;
		int lcm = 0;
		for(int i=1;i<=a[0];i++) {
			if(a[0]%i==0 && a[1]%i==0 && a[2]%i==0) {
				gcd = i;
			}
		}
		
		for(int i=a[2];i<=a[0]*a[1]*a[2];i++) {
			if(i%a[0]==0 && i%a[1]==0 && i%a[2]==0) {
				lcm = i;
				break;
			}
		}
		System.out.printf("%d%d 籔 %d 程そ计 %d\n", a[0], a[1], a[2], gcd);
		System.out.printf("%d%d 籔 %d 程そ计 %d", a[0], a[1], a[2], lcm);
	}
}