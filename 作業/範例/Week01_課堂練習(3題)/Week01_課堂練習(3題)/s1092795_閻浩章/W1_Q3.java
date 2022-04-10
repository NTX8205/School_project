//
//Q3: 計算兩個正整數的最大公因數&最小公倍數
//
//資管二B 410927957 閻浩章
//Date:2022/02/23
import java.util.ArrayList;
import java.util.Scanner;
public class W1_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(n+"與"+m+"的最大公因數為"+gcd(n,m));
		System.out.println(n+"與"+m+"的最小公倍數為"+lcm(n,m));
	}
	public static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	public static int gcd(int i, int j) {
		if(i%j==0) {
			return j;
		}else {
			return gcd(j,i%j);
		}
	}
}
