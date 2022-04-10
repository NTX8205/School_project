//Q2.計算兩個正整數的最大公因數&最小公倍數
//資管二B 梁實翔 410917504
//2022/03/15
import java.util.*;
public class W3_Q2 {

	public W3_Q2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int LCM = (x*y)/GCD(x,y);
		System.out.println(GCD(x,y));
		System.out.print(LCM);
	}
	static int GCD(int x, int y) {
		int c;
		c = x%y;
		if(c==0) {
			return y;
		}else {
			return GCD(y,c);
		}
	}
}
