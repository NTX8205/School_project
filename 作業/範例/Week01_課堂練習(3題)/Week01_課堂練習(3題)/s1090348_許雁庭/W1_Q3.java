//戈恨B-410903482-砛董畑
//Q3璸衡ㄢタ俱计程そ计(GCD)&程そ计(LCM)

import java.util.Scanner;
public class Q3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt() , y = sc.nextInt();
		
		System.out.println(x + "籔" + y + "程そ计" + GCD(x,y));
		System.out.println(x + "籔" + y + "程そ计" + LCM(x,y));
	}
	
	static int GCD(int x , int y) {//程そ计
		int z;
		z = x % y;//緇计
		if(z == 0) {
			return y;
		}else {
			return GCD(y,z);
		}
	}
	
	static int LCM(int x , int y) {//程そ计
		int tmp = 1;

		for(int i = 1 ; i <= x ; i++) {
			if(x % i ==0 && y % i ==0) {
				tmp = i;
			}
		}
		
		return (x*y/tmp);
	}
	
}