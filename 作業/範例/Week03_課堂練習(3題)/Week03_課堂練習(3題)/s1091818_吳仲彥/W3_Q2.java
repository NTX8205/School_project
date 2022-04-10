//Q2:璸衡2タ俱计程そ计&程そ计
//痁 戈恨2A 厩腹 410918186 ﹎ ヲ
//2022/3/15
import java.util.*;
public class W3_Q2 
{
	static void f(int x,ArrayList<Integer> o)
	{
		for(int i=2; i<=x; i++)
		{
			while(x!=i)
			{
				if(x%i==0)
				{
					o.add(i);
					x /= i;
				}
				else
				{
					break;
				}
			}
		}
		o.add(x);
	}
	
	 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt(), y=sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		f(x,a);
		f(y,b);
		System.out.println(a);
		System.out.println(b);
		int GCD=1, LCM=1;
		for(int i =0; i<a.size(); i++) 
		{
			for(int j =0; j<b.size(); j++) 
			{
				if(a.get(i)==b.get(j)) 
				{
					GCD*=a.get(i);
					a.remove(i);
					b.remove(j);
					i--;
					j--;
					break;
				}
			}
		}
		System.out.printf("%d籔%d程そ计%d%n",x , y, GCD);
		LCM=GCD;
		for(int q : a) 
		{
			LCM*=q;
		}
		for(int p : b)
		{
			LCM*=p;
		}
		System.out.printf("%d籔%d程そ计%d",x , y, LCM);
	}
}
