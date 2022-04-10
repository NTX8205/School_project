//ㄢ计程そ计籔程そ计
//戈恨B 410917693 砛蕹
//111/03/11
import java.util.*;
public class W3_Q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("叫琁ㄢタ俱计");
		int x = sc.nextInt(),y = sc.nextInt(),sum=1;
		int a = x,b = y;
		ArrayList<Integer> m = new ArrayList();
		ArrayList<Integer> n = new ArrayList();
		if(x>y)
		{
			int tem = x;
			x = y;
			y = tem;
		}
		
		for(int i = 2;i < x;)
		{
			if(x%i==0)
			{
				m.add(i);
				x/=i;
			}
			else
			{
				i++;
				continue;
			}
		}
		for(int j = 2;j < y;)
		{
			if(x%j==0)
			{
				n.add(j);
				y/=j;
			}
			else
			{
				j++;
				continue;
			}
		}
			for(int i = 0; i < m.size();i++)
			{
				for(int j = 0; j < n.size();j++)
				{
					if(m.get(i) == n.get(j))
					{
						sum *= m.get(i);
						m.set(i, 1);
						break;
					}
					
				}
			}
		
		
		int count = a*b/sum;
		System.out.println(a+"籔"+b+"程そ计"+sum);
		System.out.println(a+"籔"+b+"程そ计"+count);
	}
}
