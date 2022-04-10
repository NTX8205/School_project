/* 
 * W3_0309
 * Q2: 璸衡2タ俱计程そ计(gcd)&程そ计(lcm)
 * 
 * 痁 : 戈恨B
 * 厩腹 : 410917847
 * ﹎ : 薇
 * ら戳 : 110/3/12
 */

import java.io.*;
import java.util.*;

public class W3_Q2 
{	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int a = x; 
		int b = y;
		
		ArrayList A = new ArrayList(), B = new ArrayList();
		
		int k = 2;
		
		System.out.print(x + " = ");
		while(x > k) 
		{
			if(x % k == 0) 
			{
				System.out.print(k + "*");
				A.add(k);
				x /= k;
			}else {
				k++;
			}
		}
		System.out.println(k);
		A.add(k);
		
		System.out.print(y + " = ");
		
		k = 2;
		while(y > k) 
		{
			if(y % k == 0) 
			{
				System.out.print(k + "*");
				B.add(k);
				y = y/k;
			}else {
				k++;
			}
		}
		System.out.println(k);
		B.add(k);

		int gcd = 1,lcm = 1;
		
		int count = 0;
		for(int i = 0;i < A.size();i++) 
		{
			for(int j = 0;j < B.size();j++) 
			{
				if(A.get(i) == B.get(j)) 
				{
					gcd *= (int)A.get(i);
					B.set(j,1);
					count++;
					break;
				}
			}
			if(A.get(i) == " ") 
			{
				A.set(i,1);
			}
			if(B.get(i) == " ") 
			{
				B.set(i,1);
			}
		}
		
		for(int c = 0;c < A.size();c++) 
		{
			lcm *= (int)A.get(c) * (int)B.get(c);
		}
		
		System.out.printf("%d籔%d程そ计%d\n",a,b,gcd);
		System.out.printf("%d籔%d程そ计%d",a,b,lcm);
	}
}
