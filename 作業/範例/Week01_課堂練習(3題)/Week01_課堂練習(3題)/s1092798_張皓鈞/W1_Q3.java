//
//Q3: 璸衡ㄢタ俱计程そ计&程そ计
//痁:戈恨A/厩腹:410927981/﹎:眎祋秜
//
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int GCD = 0;
		int LCM = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				GCD=i;
			}
		}
		LCM= (a*b)/GCD;
		System.out.println(a+"籔"+b+"程そ计"+GCD);
		System.out.println(a+"籔"+b+"程そ计"+LCM);
	}
}
