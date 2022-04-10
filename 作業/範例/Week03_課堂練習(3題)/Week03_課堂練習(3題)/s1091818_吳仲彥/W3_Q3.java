//Q3:璸衡3タ俱计程そ计&程そ计
//痁 戈恨2A 厩腹 410918186 ﹎ ヲ
//2022/3/15
import java.util.*;
public class W3_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt(), y=sc.nextInt(), z=sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		int f=2; int GCD=1; int LCM=1;
		int X=x; int Y=y; int Z=z;
		while(X>=f && Y>=f && Z>=f) 
		{
			if(X%f==0 && Y%f==0 && Z%f==0) 
			{
				GCD*=f;
				LCM*=f;
				X/=f;
				Y/=f;
				Z/=f;		
			}
			else if(X%f==0 && Y%f==0)
			{
				LCM*=f;
				X/=f;
				Y/=f;
			}
			else if(X%f==0 && Z%f==0)
			{
				LCM*=f;
				X/=f;
				Z/=f;
			}
			else if(Z%f==0 && Y%f==0)
			{
				LCM*=f;
				Z/=f;
				Y/=f;
			}
			else
			{
				f++;
			}
		}
		LCM=LCM*X*Y*Z;
		System.out.printf("%d籔%d籔%d程そ计%d%n",x , y, z, GCD);
		System.out.printf("%d籔%d籔%d程そ计%d",x , y, z, LCM);
	}
}