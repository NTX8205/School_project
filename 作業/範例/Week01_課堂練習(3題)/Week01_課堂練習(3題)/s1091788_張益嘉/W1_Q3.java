/*
痁:戈恨B
厩腹:410917889
﹎:眎痲古
Q3: 璸衡ㄢタ俱计程そ计&程そ计
 */
package main;
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int a=x,b=y;
		int gcd=0;
		while(a%b!=0) {
			gcd=b;
			b=a%b;
			a=gcd;
		}
		System.out.println(x+"籔"+y+"程そ计"+b);
		System.out.println(x+"籔"+y+"程そ计"+x*y/b);
	}
}