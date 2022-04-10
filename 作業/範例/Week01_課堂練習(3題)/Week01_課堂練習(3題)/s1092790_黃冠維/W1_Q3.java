//程そ计 ,程そ计
//戈恨A 410927907 独玜蝴
//Date:2022/2/23
import java.util.Scanner;

public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+"籔"+ y + "程そ计" + GCD(x,y));
		System.out.println(x+"籔"+ y + "程そ计" + LCM(x,y));
	}
	
	static int GCD(int a , int b) {
		int c ;
		c = a % b;
		if (c == 0) {
			return b ;
		}
		else {
			return GCD(b,c);
		}
	}
	
	static int LCM(int a, int b) { 
		return a * b / GCD(a, b);
	}
}
