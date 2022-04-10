// Q2: 璸衡2タ俱计程そ计&程そ计
// 410918306 戈恨A 猋
// ら戳 2022/3/15

package DataStructure;
import java.util.*;
public class W3_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("叫块ㄢタ俱计");
		int a = sc.nextInt();
		int aa = a;
		int acount = 0;  // a计だ秆皚
		int b = sc.nextInt();
		int bb = b;
		int bcount = 0;  //b计だ秆皚
		int k = 2;  
		int gcd = 1;
		int lcm = 1;
		
		if(a==1 || b==1) {
			gcd = 1;
			lcm = a*b;
		}else {
			for(int i=0;i<a;i++) {
				while(aa>=k) {
					if(aa%k==0) {
						acount++;
						aa=aa/k;
					}else {
						k++;
					}
				}
			}
			int[] A = new int[acount];
			aa = a;
			k = 2;
			for(int i=0;i<acount;i++) {
				if(aa>=k) {
					if(aa%k==0) {
						A[i] = k;
						aa = aa/k;
					}else {
						k++;
						i--;
					}
				}
			}
			System.out.print(a+"=");
			
			for(int i=0;i<acount-1;i++) {
				System.out.print(A[i]+"*");
			}
			System.out.println(A[acount-1]);
			
			k = 2;
			for(int i=1;i<b;i++) {
				while(bb>=k) {
					if(bb%k==0) {
						bcount++;
						bb = bb/k;
					}else {
						k++;
					}
				}
			}
			int[] B = new int[bcount];
			bb = b;
			k = 2;
			for(int i=0;i<bcount;i++) {
				if(bb>=k) {
					if(bb%k==0) {
						B[i] = k;
						bb = bb/k;
					}else {
						k++;
						i--;
					}
				}
			}
			System.out.print(b+"=");
			
			for(int i=0;i<bcount-1;i++) {
				System.out.print(B[i]+"*");
			}
			System.out.println(B[acount-1]);
			
			int i=0,j=0;
			while(i<acount) {
				if(A[i]==B[j]) {
					gcd = gcd*A[i];
					A[i] = 0;
					B[j] = 0;
					i++;
					j++;
				}else {
					j++;
				}
				if(j==bcount) {
					j=0;
					i++;
				}
			}
			for(int p=0;p<acount;p++) {
				if(A[p]!=0) {
					lcm = lcm*A[p];
				}
			}
			for(int p=0;p<bcount;p++) {
				if(B[p]!=0) {
					lcm = lcm*B[p];
				}
			}
			lcm = lcm*gcd;
		}
		System.out.println(a+"籔"+b+"程そ计"+gcd);
		System.out.println(a+"籔"+b+"程そ计"+lcm);
	}
}
