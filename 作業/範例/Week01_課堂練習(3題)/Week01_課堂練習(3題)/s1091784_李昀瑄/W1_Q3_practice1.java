/* 
 * W1_0223
 * Q3_肂絤策: 璸衡ㄢタ俱计程そ计&程そ计(癹伴秆猭)
 * 
 * 痁 : 戈恨B
 * 厩腹 : 410917847
 * ﹎ : 薇
 * ら戳 : 110/3/1
 */

import java.io.*;
import java.util.*;

public class  W1_Q3_practice1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		//gcd 程そ计
		//lcm 程そ计
		
		int i = x;	//i = 18 
		int j = y;	//j = 30
		int a = 0,b = 0;
		
		if(x < y) 
		{
			a = y;	//a = 30
			y = x;	//y = 18
			x = a;	//x = 30
		}
		while(y != 0) 	//璸衡ㄢ俱计程そ计
		{
			b = x % y;
			x = y;	//x = i籔j程そ计
			y = b;	//y = x 埃 y 緇计 
		}
		
		int t = i * j / x;	//璸衡ㄢ俱计程そ计
		
		System.out.printf("%d籔%d程そ计%d\n",i,j,x);
		System.out.printf("%d籔%d程そ计%d",i,j,t);
	}
}