/* 
 * W1_0223
 * Q3: 璸衡ㄢタ俱计程そ计&程そ计
 * 
 * 痁 : 戈恨B
 * 厩腹 : 410917847
 * ﹎ : 薇
 * ら戳 : 110/2/23
 */

import java.io.*;
import java.util.Scanner;

public class W1_Q3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		//gcd 程そ计
		//lcm 程そ计
		System.out.printf("%d籔%d程そ计%d\n",x,y,gcd(x, y));
		System.out.printf("%d籔%d程そ计%d",x,y,lcm(x,y));
	}
	
	static int gcd(int a,int b) 
	{
		int c;
		c = a % b;
		
		if(c == 0) 
			return b;
		else
			return gcd(b,c);
	}
	
	static int lcm(int a,int b) 
	{
		return a * b / gcd(a,b);
	}
}