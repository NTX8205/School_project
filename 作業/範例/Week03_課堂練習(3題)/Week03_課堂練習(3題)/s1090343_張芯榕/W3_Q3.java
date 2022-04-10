// Q3:璸衡3タ俱计程そ计&程そ计

// 戈恨A / 眎篲 / 410903432
// 12 15 18
import java.util.*;

public class W3_Q3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// ㄏノ块
		System.out.println("叫块计ぃタ俱计xy㎝z");
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		
		// xΑだ秆
		ArrayList<Integer> A = new ArrayList();
		int n = x, p = 2;
		while(n != 1) 
		{
			if(n % p == 0) 
			{
				A.add(p);
				n /= p;
			}else 
				p++;
		}
		
		// yΑだ秆
		ArrayList<Integer> B = new ArrayList();
		n = y;
		p = 2;
		while(n != 1) 
		{
			if(n % p == 0) 
			{
				B.add(p);
				n /= p;
			}else 
				p++;
		}
		
		// zΑだ秆
		ArrayList<Integer> C = new ArrayList();
		n = z;
		p = 2;
		while(n != 1) 
		{
			if(n % p == 0) 
			{
				C.add(p);
				n /= p;
			}
			else 
				p++;
		}
		
		/*// 刚块
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		*/
		
		// 眔程そ计
		int gcd = 1, lcm = 1;
		for(int i = 0; i < A.size(); i++) 
		{
			for(int j = 0; j < B.size();) 
			{
				for(int k = 0; k < C.size();) 
				{
					if(A.get(i) == B.get(j) && B.get(j) == C.get(k))
					{
						gcd *= A.get(i);
						A.set(i, 0);
						B.set(j, 0);
						C.set(k, 0);
					}
					k++;
				}
				j++;
			}
		}
		
		// 刚块
		System.out.println();
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		// 程そ计
		
		for(int i = 0; i < A.size(); i++) 
		{
			for(int j = 0; j < B.size();) 
			{
				for(int k = 0; k < C.size();) 
				{
				if(A.get(i) == B.get(j) || A.get(i) == C.get(k) ||B.get(j) == C.get(k))
					{
						if(A.get(i) == B.get(j) && A.get(i) != C.get(k) && A.get(i) != 0)
						{
							lcm *= A.get(i);
							A.set(i, 0);
							B.set(j, 0);
						}
						else if(A.get(i) == C.get(k) && A.get(i) != B.get(j) && A.get(i) != 0)
						{
							lcm *= A.get(i);
							A.set(i, 0);
							C.set(k, 0);
						}
						else if(B.get(j) == C.get(k) && A.get(i) != B.get(j) && B.get(j) != 0)
						{
							lcm *= B.get(j);
							B.set(j, 0);
							C.set(k, 0);
						}
					}
					k++;
				}
				j++;
			}
		}
		
		for(int i = 0; i < A.size(); i++)
			if(A.get(i) != 0)
				lcm *= A.get(i);
		
		for(int i = 0; i < B.size(); i++)
			if(B.get(i) != 0)
				lcm *= B.get(i);
		
		for(int i = 0; i < C.size(); i++)
			if(C.get(i) != 0)
				lcm *= C.get(i);
		
		// 块
		System.out.printf("%d%d㎝%d程そ计%d%n", x, y, z, gcd);
		System.out.printf("%d%d㎝%d程そ计%d%n", x, y, z, lcm*gcd);
		
	}
}
