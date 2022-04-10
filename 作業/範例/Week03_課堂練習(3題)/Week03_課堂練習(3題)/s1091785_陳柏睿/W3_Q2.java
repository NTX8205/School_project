import java.util.*;
public class W3_Q2 
	{
	public static void main(String[] args) 
		{
		//資管二A 410917855 陳柏睿
		//Q2: 計算2個正整數的最大公因數(gcd)&最小公倍數(lcm)
	Scanner io=new Scanner(System.in);
	System.out.println("請輸入兩個不為0的正整數:");
	int a=io.nextInt(),b=io.nextInt(), max=Math.max(p(a),p(b)),min=Math.min(p(a),p(b));
	int LCM=1,k[]=pp(a),r[]=pp(b);
		for(int i=0;i<max;i++)
			{
			for(int j=0;j<min;j++) 
				{
				if(k.length>r.length)
					{
					if(k[i]==r[j]) 
						{
						LCM*=k[i];
						k[i]=0;
						r[j]=0;
						break;
						}
					}
				if(k.length<=r.length) 
					{
					if(k[j]==r[i]) 
						{
							LCM*=k[j];
							k[j]=0;
							r[i]=0;
							break;
						}
					}
				}
			}
		System.out.println("LCM:"+LCM);
		System.out.println("GCD:"+LCM*ppp(r)*ppp(k));
	}
	static int p(int a) 
		{
		int sum=0;
		while(a!=1) 
			{
			for(int i=2;i<=a;i++) 
				{
				if(a%i==0) 
					{
						sum++;
						a/=i;
						break;
					}
				}
			}
			return sum;
		}
	static int[] pp(int a) 
		{
		int b[]=new int[p(a)];
		for(int j=0;j<b.length;j++) 
			{
			for(int i=2;i<=a;i++)
				{
				if(a%i==0) 
					{
					b[j]+=i;
					a/=i;
					break;
					}
				}
			}
			return b;
		}
	static int ppp(int r[]) 
		{
		int k=1;
		for(int i=0;i<r.length;i++) 
			{
			if(r[i]>0) 
				{
				k*=r[i];
				}
			}
		return k;
		}
}
