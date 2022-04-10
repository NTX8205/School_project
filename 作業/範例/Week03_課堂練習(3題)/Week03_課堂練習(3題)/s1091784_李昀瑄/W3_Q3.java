/* 
 * W3_0309
 * Q3: 
 * 
 * 班級 : 資管二B
 * 學號 : 410917847
 * 姓名 : 李昀瑄
 * 日期 : 110/3/12
 */

import java.io.*;
import java.util.*;

public class W3_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		int a = x, b = y, c = z;
		
		//int A[] = new int [x];, B[] = new int [y];
		ArrayList A = new ArrayList(), B = new ArrayList(), C = new ArrayList();
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
		//System.out.println(A.toString());
		
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
		//System.out.println(B.toString());
		
		System.out.print(z + " = ");
		
		k = 2;
		while(z > k) 
		{
			if(z % k == 0) 
			{
				System.out.print(k + "*");
				C.add(k);
				z = z/k;
			}else {
				k++;
			}
		}
		System.out.println(k);
		C.add(k);
		//System.out.println(C.toString());
		
		int gcd = 1,lcm = 1;
		int count = 0;
		
		for(int i = 0;i < A.size();i++) 
		{
			for(int j = 0;j < B.size();j++) 
			{
				for(int h = 0;h < C.size();h++) {
					if(A.get(i) == B.get(j)) 
					{
						gcd *= (int)A.get(i);
						B.set(j,1);
						if(A.get(i) == C.get(h)) {
							C.set(h,1);
							count++;
							break;
						}
						count++;
						break;
					}
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
			if(C.get(i) == " ") 
			{
				C.set(i,1);
			}
		}
		
		for(int d = 0;d < A.size();d++) 
		{
			lcm *= (int)A.get(d) * (int)B.get(d) * (int)C.get(d);
		}
		
		System.out.printf("%d,%d,%d的最大公因數為%d\n",a,b,c,gcd);
		System.out.printf("%d,%d,%d的最小公倍數為%d",a,b,c,lcm);
	}
}
