//程そ计&程そ计
//戈恨B 410917693 砛蕹
//2022/02/23
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		System.out.println(a+"籔"+b+"程そ计"+GCD(a, b));
		System.out.println(a+"籔"+b+"程そ计"+LCM(a, b));
	}
	public static int GCD(int a, int b) {
		if(a%b == 0) {
			return b;
		}else {
			return GCD(b, a%b);	
		}
	}
	public static int LCM(int a, int b) {
		return a*b/GCD(a, b);
	}
}

