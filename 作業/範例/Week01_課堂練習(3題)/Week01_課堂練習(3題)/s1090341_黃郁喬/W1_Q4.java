/*
肈ヘ: 璸衡ㄢタ俱计程そ计&程そ计(癹伴)
痁:戈恨A ﹎:独踌 厩腹:410903416
 */

import java.util.Scanner;
public class W1_Q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=0;
		int lcm=1;
		while(a>=lcm) {
			if(a%lcm==0 && b%lcm==0)
				gcd=lcm;
			lcm++;
		}
		while(true) {
			if(lcm%a==0 && lcm%b==0)
				break;
			lcm++;
		}
		System.out.println(a+"籔"+b+"程そ计:"+gcd);
		System.out.println(a+"籔"+b+"程そ计:"+lcm);
	}

}