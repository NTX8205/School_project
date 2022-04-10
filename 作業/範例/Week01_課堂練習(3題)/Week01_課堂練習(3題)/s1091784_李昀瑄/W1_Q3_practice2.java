/* 
 * W1_0223
 * Q3_肂絤策: 璸衡タ俱计程そ计&程そ计
 * 
 * 痁 : 戈恨B
 * 厩腹 : 410917847
 * ﹎ : 薇
 * ら戳 : 110/3/1
 */

import java.io.*;
import java.util.*;

public class W1_Q3_practice2 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		//gcd 程そ计
		//lcm 程そ计
		
		int i = x;
		int j = y;
		int k = z;
		int a = 0,b = 0;
		
		if(x < y) 
		{
			a = y;
			y = x;
			x = a;
		}
		
		int gcd = gcd(i,j);//―i㎝jㄢ程そ计gcd
		int gcd1 = gcd(k,gcd);//―玡ㄢ计程そ计gcd㎝材计k程そ计
		
		int lcm = lcm(i,j,gcd);//―i㎝j程そ计lcm
		int gcd2 = gcd(lcm,k);	//―lcm㎝k程そ计
	
		int t2 = lcm(lcm,k,gcd2);//―lcm㎝k程そ计
		
		System.out.printf("%d,%d,%d程そ计%d\n",i,j,k,gcd1);
		System.out.printf("%d,%d,%d程そ计%d",i,j,k,t2);
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
	
	static int lcm(int a,int b,int gcd) 
	{
		return a / gcd * b;
	}
}
