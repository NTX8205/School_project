/* Q2:璸衡2タ俱计程そ计&程そ计冨
 * 
 * 秆肈郸菠:块ㄢタ俱计x, yノ计だ秆盢–タ俱计计だ皚(array)い
 * 			x计皚Ay计皚B
 * 			ノㄢ计皚A,B戈ㄓ璸衡ㄢタ俱计程そ计籔程そ计
 * Example: 冨
 * 			x=18, y = 30冨
 * 			18=2*3*3 劵皚A纗[2,3,3]冨
 * 			30=2*3*5 劵皚B纗[2,3,5]冨
 * 			硓筁眖繷Ю砐硂ㄢ皚, 
 * 			衡18籔30程そ计618籔30程そ计90 */

// 戈恨A / 眎篲 / 410903432

import java.util.*;

public class W3_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// ㄏノ块
		System.out.println("叫块ㄢ计ぃタ俱计 x ㎝ y");
		int x = sc.nextInt(), y = sc.nextInt();
		
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
		
		/*// 刚块
		System.out.println(A);
		System.out.println(B);
		*/
		
		// 眔程そ计
		int gcd = 1, lcm = 1;
		for(int i = 0; i < A.size(); i++) 
		{
			int j = 0;
			while(j < B.size())
			{
				if(A.get(i) == B.get(j))
				{
					gcd *= A.get(i);
					A.set(i, 0);
					B.set(j, 0);
				}
				j++;
			}
		}
		
		// 程そ计
		for(int i = 0; i < A.size(); i++)
			if(A.get(i) != 0)
				lcm *= A.get(i);
		
		for(int i = 0; i < B.size(); i++)
			if(B.get(i) != 0)
				lcm *= B.get(i);
		
		// 块
		System.out.printf("%d㎝%d程そ计%d%n", x, y, gcd);
		System.out.printf("%d㎝%d程そ计%d%n", x, y, lcm*gcd);
	}
}
