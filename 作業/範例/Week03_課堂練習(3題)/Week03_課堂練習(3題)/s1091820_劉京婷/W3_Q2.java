/*
 	ら戳:2022/03/09
 	肈ヘ:Q2:璸衡2タ俱计程そ计&程そ计(ノ皚)
	痁:戈恨A
	厩腹:410918209
	﹎:糂ㄊ碄
 */
import java.util.*;
public class W3_Q2
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,x=sc.nextInt();
		int y=sc.nextInt();
		int a[]=new int [10];
		int b[]=new int [10];
		
		for(int i=2;i<=x;i++) 
		{
			while(i<=x) 
			{
				if(x%i==0)
				{
					a[++sum]=i;
					x=x/i;
				}
				System.out.print(a[sum]+" ");
			}
		}
		System.out.println(sum);
		sum=0;
		for(int i=2;i<=y;i++) 
		{
			while(i<=y)
			{
				if(y%i==0) 
				{
					b[++sum]=i;
					y=y/i;	
				}
				System.out.print(b[sum]+" ");
			}
		}
		
		System.out.println(sum);
		int gcd=1,lcm=1;
		for(int i=0,j=0;i<a.length;i++) 
		{
			for(int k=j;k<b.length;k++) 
			{
				if(a[i]==b[k]) 
				{
				    j=k+1;
					gcd*=a[i];
					b[k]=1;
					//break;
					//System.out.print(gcd);
				}
			}
			
		}
		System.out.print(gcd);
		System.out.printf("%d籔%d程そ计%d%n",x,y,gcd);
		System.out.printf("%d籔%d程そ计%d%n",x,y);
	}
}
