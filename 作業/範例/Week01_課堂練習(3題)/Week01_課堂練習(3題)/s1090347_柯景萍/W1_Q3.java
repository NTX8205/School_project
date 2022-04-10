//肈ヘ弧:璸衡ㄢタ俱计程そ计&程そ计
//戈恨A 410903474 琠春涤
//Date:2022/03/01

import java.util.Scanner;
public class W1_Q3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.printf("%d籔%d程そ计%d\r\n",a,b,k.getgcd(a,b));
	System.out.printf("%d籔%d程そ计%d",a,b,k.getlcm(a,b));
	}
}
class k {
	public static int getgcd(int a,int b) {
		int x;
		while(b!=0) {
			x=a%b;
			a=b;
			b=x;
		}
		return a;
	}
	public static int getlcm(int a,int b) {
		return a*b/getgcd(a,b);
	}
}